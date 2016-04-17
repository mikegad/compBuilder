package com.compbuilder.model;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;

public class Cart implements Serializable {

    private ArrayList<CompBean> items;
    private final double taxRate = 0.06;

    public Cart() {
        items = new ArrayList<CompBean>();
    }

    public ArrayList<CompBean> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(CompBean item) {
        items.add(item);
    }

    public double subTotal() {
        double totalCost = 0;
        for (int i = 0; i < items.size(); i++) {
            CompBean lineItem = items.get(i);
            totalCost += lineItem.totalCost;
        }
        return totalCost;
    }

    public String subTotaltoString() {
        return convertMoney(subTotal());
    }

    public String salesTax() {
        return convertMoney(subTotal() * this.taxRate);
    }

    public String Total() {
        return convertMoney(subTotal() * (1 + this.taxRate));
    }

    private String convertMoney(double dollars) {
        NumberFormat money = NumberFormat.getInstance();
        money.setMaximumFractionDigits(2);
        money.setMinimumFractionDigits(2);
        return money.format(dollars);
    }

    public void removeItem(int i) {
        items.remove(i);
    }
}
