package View;

import com.aprilhoward.Inventory;
import com.aprilhoward.Vendable;

import java.math.BigDecimal;

public class VendingMachineCLI {

        private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
        private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
        private static final String MAIN_MENU_EXIT = "Exit";
        private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT };

        private static final String FEED_MONEY_OPTION_DISPLAY_ITEMS = "Feed Money";
        private static final String SELECT_PRODUCT_OPTION = "Select Product";
        private static final String FINISH_TRANSACTION_OPTION = "Finish Transaction";
        private static final String[] PURCHASE_MENU_OPTIONS = { FEED_MONEY_OPTION_DISPLAY_ITEMS, SELECT_PRODUCT_OPTION, FINISH_TRANSACTION_OPTION};
        Purchase purchase = new Purchase();

        Inventory inventory;
        private Menu menu;

        public VendingMachineCLI(Menu menu, Inventory inventory) {
            this.menu = menu;
            this.inventory = inventory;
        }

        public void run() {
            while (true) {
                String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS, purchase);

                if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                    System.out.println();
                    System.out.printf("%-8s%-23s%-22s\n", "SLOT", "ITEM", "PRICE");
                    System.out.println("----------------------------------------");
                    for(Vendable v : inventory.getAllItems()) {
                        System.out.printf("%-8s%-23s%-22s\n",v.getSlot(), v.getName(),v.getPrice());
                    }
                } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                    makePurchase();

                } else if(choice.equals(MAIN_MENU_EXIT)) {
                   run();
                }
            }

        }
        public void makePurchase() {
            while (true) {
                String choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS, purchase);
                if (choice.equals(FEED_MONEY_OPTION_DISPLAY_ITEMS)) {
                    purchase.feedMoney();
                    makePurchase();
                } else if (choice.equals(SELECT_PRODUCT_OPTION)) {
                    System.out.println();
                    System.out.printf("%-8s%-23s%-22s\n","SLOT","ITEM","PRICE");
                    System.out.println("--------------------------------------");
                    for(Vendable v : inventory.getAllItems()) {
                        System.out.printf("%-8s%-23s%-22s\n",v.getSlot(), v.getName(),v.getPrice());
                    }
                    purchase.buySomething(this.inventory);

                }else if (choice.equals(FINISH_TRANSACTION_OPTION)){
                    purchase.makeChange();
                    purchase.getCurrentMoney().equals(new BigDecimal("0.0"));
                    System.exit(1);
                }

            }
        }


        public static void main(String[] args) {
            Menu menu = new Menu(System.in, System.out);
            CSVLoader loader = new CSVLoader();
            VendingMachineCLI cli = new VendingMachineCLI(menu, loader.loadMachine());
            cli.run();
        }
    }

