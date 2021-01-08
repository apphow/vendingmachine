package com.aprilhoward;

import java.math.BigDecimal;

public class Candy extends Vendable{

    public Candy(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String getSound() {
        return "Munch Munch, Yum!";

    }
    @Override
    public String toString() {
        return this.getSound();
    }
}