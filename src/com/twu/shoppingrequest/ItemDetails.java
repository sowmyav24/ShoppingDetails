package com.twu.shoppingrequest;

public class ItemDetails {
    private int quantity;
    private String itemName;
    private double price;
    private SalesTax salesTax;
    private double salesTaxAmount;

    ItemDetails(int quantity, String itemName, double price) {
        this.quantity = quantity;
        this.itemName = itemName;
        this.price = price;
        salesTax = new SalesTax(this);
    }

    public String returnDetails() {
        return this.itemName;
    }

    public double calculateTax() {
        if (!salesTax.checkIfSalesTaxIsApplicable()) {
            salesTaxAmount+=0.1 * this.price;
            this.price += 0.1 * this.price;
        }
        return salesTaxAmount;
    }
}
