package com.ecommerce.listener;

import com.ecommerce.event.OrderPlacedEvent;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class OrderPlacedEventListener {

    private static final Logger LOGGER = Logger.getLogger(OrderPlacedEventListener.class.getName());

    private final KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;
    private final ObservationRegistry observationRegistry;

    public OrderPlacedEventListener(KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate,
                                    ObservationRegistry observationRegistry) {
        this.kafkaTemplate = kafkaTemplate;
        this.observationRegistry = observationRegistry;
    }


    @EventListener
    public void handleOrderPlacedEvent(OrderPlacedEvent event) {
        LOGGER.info(String.format("Order Placed Event Received, Sending OrderPlacedEvent to notificationTopic: %s",
                event.getOrderNumber()));

        try {
            Observation.createNotStarted("notification-topic", this.observationRegistry).observeChecked(() -> {
                CompletableFuture<SendResult<String, OrderPlacedEvent>> future = kafkaTemplate.send("notificationTopic",
                        event);
                return future.handle((result, throwable) -> CompletableFuture.completedFuture(result));
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error while sending message to Kafka", e);
        }
    }
}
