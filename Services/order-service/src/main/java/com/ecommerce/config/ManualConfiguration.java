package com.ecommerce.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@Configuration(proxyBeanMethods = false)
public class ManualConfiguration {

    private final KafkaTemplate<?, ?> kafkaTemplate;

    // Constructor for dependency injection
    public ManualConfiguration(KafkaTemplate<?, ?> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostConstruct
    public void setup() {
        this.kafkaTemplate.setObservationEnabled(true);
    }
}
