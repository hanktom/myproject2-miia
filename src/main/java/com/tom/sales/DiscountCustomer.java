package com.tom.sales;

public class DiscountCustomer extends Customer {
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public float backMoney() {
        return amount*off;
    }
}
