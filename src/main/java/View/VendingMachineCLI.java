package View;

public class VendingMachineCLI {

    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT };

    private static final String FEED_MONEY_OPTION_DISPLAY_ITEMS = "Feed Money";
    private static final String SELECT_PRODUCT_OPTION = "Select Product";
    private static final String FINISH_TRANSACTION_OPTION = "Finish Transaction";
    private static final String[] PURCHASE_MENU_OPTIONS = { FEED_MONEY_OPTION_DISPLAY_ITEMS, SELECT_PRODUCT_OPTION, FINISH_TRANSACTION_OPTION};

    private Menu menu;

    public VendingMachineCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                // display vending machine items
                System.out.println("Display items here");
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                makePurchase();

            } else if(choice.equals(MAIN_MENU_EXIT)) {
                System.exit(1);
            }
        }
    }
    public void makePurchase() {
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

            if (choice.equals(FEED_MONEY_OPTION_DISPLAY_ITEMS)) {
                // TODO feed money option
                System.out.println("feed money here");
            } else if (choice.equals(SELECT_PRODUCT_OPTION)) {
                // display vending machine items
                System.out.println("Select product here");
            }else if (choice.equals(FINISH_TRANSACTION_OPTION)){
                System.out.println("issues change and restarts program");
                //TODO issue change restart program and balance to zero

            }
        }
    }


    public static void main(String[] args) {
        Menu menu = new Menu(System.in, System.out);
        VendingMachineCLI cli = new VendingMachineCLI(menu);
        cli.run();
    }
}
