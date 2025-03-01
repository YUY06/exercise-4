public class Slice_o_Heaven {

    private String orderID;
    private double orderTotal;
    public String storeName;
    public String storeAdddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;


    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;

    
    public Slice_o_Heaven() {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = "";
        this.drinks = "";
    }

    
    public Slice_o_Heaven(String orderID, String pizzaIngredients, double orderTotal) {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }
    
    public String getOrderID() {
        return orderID;
    }

    
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    
    public double getOrderTotal() {
        return orderTotal;
    }

    
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    
    public void takeOrder(String id, String details, double total) {
        orderID = id;
        pizzaIngredients = details;
        orderTotal = total;
        System.out.println("Order accepted!");
        System.out.println("Making the pizza");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Order is ready for pickup!");
        }

        System.out.println("Your order is ready!");
        printReceipt();
    }

    
    private void printReceipt() {
        System.out.println("--- Receipt ---");
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        System.out.println("Order Total: " + orderTotal);
    }

    
    public void processCardPayment(String cardNumber, String expiryDate, int cvv) {
        int cardLength = cardNumber.length();
        if (cardLength == 14) {
            System.out.println("Card accepted");
        } else {
            System.out.println("Invalid card");
        }

        int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));

        String blacklistedNumber = "12345678901234"; 
        if (cardNumber.equals(blacklistedNumber)) {
            System.out.println("Card is blacklisted. Please use another card");
        }

        int lastFourDigits = Integer.parseInt(cardNumber.substring(cardNumber.length() - 4));

        String cardNumberToDisplay = cardNumber.charAt(0) + cardNumber.substring(1, cardNumber.length() - 4).replaceAll(".", "*") + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Display Card Number: " + cardNumberToDisplay);
    }


    public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) {
        String info = "Today's Special - Pizza: " + pizzaOfTheDay + ", Side: " + sideOfTheDay + ", Price: " + specialPrice;
        System.out.println(info);
    }
}