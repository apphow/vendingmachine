package com.aprilhoward;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class CandyTest {
    /**
     * Methods tests
     *
     * <ul>
     *   <li>{@link Candy#Candy(String, String, BigDecimal)}
     *   <li>{@link Candy#getSound()}
     * </ul>
     */
    @Test
    public void testConstructor() {
        assertEquals("Munch Munch, Yum!", (new Candy("Slot", "Name", BigDecimal.valueOf(42L))).getSound());
    }
}

