package View;

import com.aprilhoward.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class CSVLoader {


    protected Vendable convertLineIntoVendable(String line) {
        String[] components = line.split("\\|");
        if(components.length !=4) {
            return null;
        }
        String slot = components[0].trim();
        String name = components[1].trim();
        String price = components[2].trim();
        String type = components[3].trim();
        if(type.equalsIgnoreCase("Chip")) {
            return new Chip(slot,name, new BigDecimal(price));
        }else if(type.equalsIgnoreCase("Candy")) {
            return new Candy(slot,name, new BigDecimal(price));
        }else if(type.equalsIgnoreCase("Drink")) {
            return new Drink(slot,name, new BigDecimal(price));
        }else if(type.equalsIgnoreCase("Gum")) {
            return new Gum(slot,name, new BigDecimal(price));
        }
        return null;
    }


    public Inventory loadMachine() {
        // make a new map
        Inventory i = new Inventory();

        // read the file
        try(Scanner fileScanner = new Scanner(new File("src/main/java/vendingmachine.csv"))){
            // for each item in the file

            int lineNumber = 1;
            while(fileScanner.hasNextLine()) {
                // get the line from the scanner
                String line = fileScanner.nextLine();
                Vendable p = convertLineIntoVendable(line);
                //        add the object into my map at the appropriate index
                if(p != null) {
                    i.stockItem(p.getSlot(), p);
                }

                lineNumber++;
            }
        } catch (FileNotFoundException fnf) {
            return null;
        }

        return i;
    }
}