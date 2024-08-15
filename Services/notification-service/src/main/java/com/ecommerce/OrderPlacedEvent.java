package com.ecommerce;

/**
 * Event representing a placed order.
 */
public class OrderPlacedEvent {

    private String orderNumber;

    // Default constructor
    public OrderPlacedEvent() {
    }

    // Parameterized constructor
    public OrderPlacedEvent(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    // Getter for orderNumber
    public String getOrderNumber() {
        return orderNumber;
    }

    // Setter for orderNumber
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "OrderPlacedEvent{" +
                "orderNumber='" + orderNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPlacedEvent that = (OrderPlacedEvent) o;

        return orderNumber != null ? orderNumber.equals(that.orderNumber) : that.orderNumber == null;
    }

    @Override
    public int hashCode() {
        return orderNumber != null ? orderNumber.hashCode() : 0;
    }
}
