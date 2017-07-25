package com.ekotwick;

/**
 * Created by ekotwick on 7/25/17.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        if(quantity <= availableQuantity()) { // use method, not field
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreservedStock(int quantity) {
        if(quantity <= reserved) {
            reserved -= quantity;
            return  quantity;
        }
        return 0;
    }

    public int finalizeStock(int quantity) {
        if(quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");
        if(this == o) {
            return 0;
        }

        if(o != null) {
            // here we are using the `compareTo` method that's appropriate to Strings;
            return this.name.compareTo(o.getName());
        }
        // we will not compare things that are null;
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": price " + this.price + ". Reserved: " + this.reserved;
    }
}
