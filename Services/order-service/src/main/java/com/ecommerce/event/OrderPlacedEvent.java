package com.ecommerce.event;

import org.springframework.context.ApplicationEvent;


public class OrderPlacedEvent extends ApplicationEvent {

    private final String orderNumber;


    public OrderPlacedEvent(Object source, String orderNumber) {
        super(source);
        this.orderNumber = orderNumber;
    }


    public OrderPlacedEvent(String orderNumber) {
        super(orderNumber);
        this.orderNumber = orderNumber;
    }


    public String getOrderNumber() {
        return orderNumber;
    }
}
