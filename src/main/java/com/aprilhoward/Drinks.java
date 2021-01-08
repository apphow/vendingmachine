package com.aprilhoward;

import java.math.BigDecimal;

public class Drinks extends Vendable{

    public Drinks(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Glug Glug, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }
}