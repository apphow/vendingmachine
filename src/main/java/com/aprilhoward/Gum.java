package com.aprilhoward;

import java.math.BigDecimal;

public class Gum extends Vendable{

    public Gum(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Chew Chew, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }
}