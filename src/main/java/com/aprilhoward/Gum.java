package com.aprilhoward;

import java.math.BigDecimal;

public class Gum extends Vendable{

    public Gum(String slot, String name, BigDecimal price) {
        super(slot, name, price);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getSound() {
        // TODO Auto-generated method stub
        return "Chew Chew, Yum!";
    }
    @Override
    public String toString() {
        return this.getSound();
    }
}
