package com.ekotwick;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ekotwick on 7/25/17.
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        // the linkedHashMap to maintain insertion order
        this.list= new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            // `getOrDefault` will either retrieve the item from the map or initialize it with what is passed to the map
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // if items in stock, adjust quantity
            // the if condition here will tell whether the item passed into the map already existed in the map
            if (inStock != item) {
                // if the item already existed, we are going to find the amount of that item already in stock and then add it to the amount of the item we are passing in
                item.adjustStock(inStock.availableQuantity());
            }

            list.put(item.getName(), item);
            return item.availableQuantity();
        }

        return 0;
    }

    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if(inStock != null && quantity > 0) {
            return inStock.reserveStock(quantity);
        }
        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if(inStock != null && quantity > 0) {
            return inStock.unreserveStock(quantity);
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
        if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock list\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            s = s + stockItem + ". There are " + stockItem.availableQuantity() + "in stock. Value of items: ";
            // the `String.format` is to fix up the bullshit that can happen with floats. the "%.2f" says that we will use only 2 decimal points
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f", totalCost);
    }
}
