package com.aprilhoward;

import java.math.BigDecimal;

public class Drink extends Vendable{

    public Drink(String slot, String name, BigDecimal price) {
        super(slot, name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getSound() {
        // TODO Auto-generated method stub
        return "Glug Glug, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }
}