package com.aprilhoward;

import java.math.BigDecimal;

public class Candy extends Vendable{

    public Candy(String name, BigDecimal price) {
        super(name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getSound() {
        // TODO Auto-generated method stub
        return "Munch Munch, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }
}