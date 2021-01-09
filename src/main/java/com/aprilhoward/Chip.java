package com.aprilhoward;

import java.math.BigDecimal;

public class Chip extends Vendable{

    public Chip(String slot, String name, BigDecimal price) {
        super(slot, name, price);

    }

    @Override
    public String getSound() {

        return  "Crunch Crunch, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }

}

