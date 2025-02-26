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
    public static final String DEF_PIZZA_INGREDIENTS ="Mozzarella Cheese";
    public static final String DEF_ORDER_TOTAL = "15.00";


    public SLiceOHeaven(){
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = DEF_PIZZA_INGREDIE;
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides ="";
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
        System.out.println("********RECEIPT********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Details: " + pizzaIngredients);
        System.out.println("Order Total: " + orderTotal);
    }
}
