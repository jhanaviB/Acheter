package com.ecommerce.dto;

/**
 * DTO for representing inventory response.
 */
public class InventoryResponse {

    private String skuCode;
    private boolean isInStock;

    // No-argument constructor
    public InventoryResponse() {
    }

    // All-arguments constructor
    public InventoryResponse(String skuCode, boolean isInStock) {
        this.skuCode = skuCode;
        this.isInStock = isInStock;
    }

    // Getters and setters
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        this.isInStock = inStock;
    }

    // Builder pattern implementation
    public static class Builder {
        private String skuCode;
        private boolean isInStock;

        public Builder withSkuCode(String skuCode) {
            this.skuCode = skuCode;
            return this;
        }

        public Builder withIsInStock(boolean isInStock) {
            this.isInStock = isInStock;
            return this;
        }

        public InventoryResponse build() {
            return new InventoryResponse(skuCode, isInStock);
        }
    }

    @Override
    public String toString() {
        return "InventoryResponse{" +
                "skuCode='" + skuCode + '\'' +
                ", isInStock=" + isInStock +
                '}';
    }
}
