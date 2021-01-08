package com.aprilhoward;

import java.math.BigDecimal;

public abstract class Vendable {

    private String slot;

    private String name;

    private BigDecimal price;

    private String type;

    private int quantity;

    private static final int DEFAULT_QUANTITY = 5;

    public Vendable(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.quantity = DEFAULT_QUANTITY;
    }

    public abstract String getSound();

    public boolean vend(){
        if(this.getQuantity()> 0) {
            this.quantity--;
            return true;
        }else {
            return false;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
