package com.aprilhoward;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



public class Inventory {


    private	Map<String, Vendable> myItems = new LinkedHashMap<String, Vendable>();


    public boolean isInStock(String slot) {
        return (myItems.containsKey(slot.toUpperCase()) && myItems.get(slot.toUpperCase()).getQuantity() > 0);

    }
    public void stockItem(String slot, Vendable item) {
        myItems.put(slot.toUpperCase(), item);
    }

    public List<Vendable> getAllItems() {
        List<Vendable> lst = new ArrayList<Vendable>();


        for(Entry<String, Vendable> each: myItems.entrySet()) {
            String itemName = each.getKey();
            Vendable item = each.getValue();
            lst.add(item);

        }
        // get entry sets and return of an array
        return lst;

    }
    public Vendable getItem(String slot) {
        return myItems.get(slot.toUpperCase());
    }
}

