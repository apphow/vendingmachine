package View;

import com.aprilhoward.Inventory;
import com.aprilhoward.Vendable;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Purchase {
    private BigDecimal currentMoney;

    Scanner userInput = new Scanner(System.in);
    Inventory inventory = new Inventory();

    //Method feed money allows customer to add money 1,2,5,10

    public void feedMoney() {
        System.out.println("Enter the amount in dollars of 1, 2, 5, or 10 >>");
        String money =userInput.nextLine();
        if (money.equals("1")) {
            currentMoney = currentMoney.add(new BigDecimal("1.0"));
        } else if (money.equals("2")) {
            currentMoney = currentMoney.add(new BigDecimal("2.0"));
        } else if (money.equals("5")) {
            currentMoney = currentMoney.add(new BigDecimal("5.0"));
        } else if(money.equals("10")) {
            currentMoney = currentMoney.add(new BigDecimal("10.0"));
        }else if(!money.equals("1")||!money.equals("2")||!money.equals("5")||!money.equals("10")) {
            System.out.println("Please enter 1, 2, 5, or 10");
            feedMoney();
        } return;

    }
    public Purchase() {
        this.currentMoney = BigDecimal.valueOf(0.0);

    }


    public void buySomething(Inventory inventory) {
        Vendable v = null;
        do {

            System.out.println("Please make a selection using the Slot ID");
            String selection = userInput.nextLine().toUpperCase();
            if(inventory.isInStock(selection)){
                v = inventory.getItem(selection);
            } else {
                System.out.println("Item sold Out");
            }


        }while(v == null);


        if(v.getPrice().compareTo(currentMoney)<1) {
            currentMoney= currentMoney.subtract(v.getPrice());
            System.out.println(v);
            v.vend();
        }else {
            System.out.println("Sorry you are so poor!");
        }


    }


    // method to log transaction
    public void makeChange() {
        BigDecimal quarter = BigDecimal.valueOf(.25);
        BigDecimal dime = BigDecimal.valueOf(.1);
        BigDecimal nickel = BigDecimal.valueOf(.05);
        System.out.println();
        System.out.println("Here comes your change:");

        BigDecimal quarterNext = currentMoney.subtract(currentMoney.multiply(quarter));
        BigDecimal q = quarterNext.divide(quarter);
        System.out.println(q.intValue() + " Quarters");

        BigDecimal dimeNext = quarterNext.subtract(quarter.multiply(BigDecimal.valueOf(q.intValue())));
        BigDecimal d = dimeNext.divide(dime);
        System.out.println(d.intValue() + " Dimes");

        BigDecimal nickelNext = dimeNext.subtract(dime.multiply(BigDecimal.valueOf(d.intValue())));
        BigDecimal n = nickelNext.divide(nickel);
        System.out.println(n.intValue() + " Nickels");




    }

    public BigDecimal getCurrentMoney() {
        return currentMoney;
    }


    public void setCurrentMoney(BigDecimal currentMoney) {
        this.currentMoney = BigDecimal.valueOf(0.0);
    }
    public Scanner getUserInput() {
        return userInput;
    }

}
