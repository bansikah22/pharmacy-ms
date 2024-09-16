package com.bansikah.pharmacy_backend.domain;

import java.util.List;

public class ReceiptResponse {

    private List<SalesItem> salesItems;
    private double totalAmount;

    // Getters and Setters
    public List<SalesItem> getSalesItems() {
        return salesItems;
    }

    public void setSalesItems(List<SalesItem> salesItems) {
        this.salesItems = salesItems;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

