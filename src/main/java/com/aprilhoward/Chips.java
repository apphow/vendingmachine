package com.aprilhoward;

import java.math.BigDecimal;

public class Chips extends Vendable{

    public Chips(String name, BigDecimal price) {
    super(name, price);
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

