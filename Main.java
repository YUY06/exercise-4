public class Main {
    public static void main(String[] args) {
        Slice_o_Heaven pizzaShop = new Slice_o_Heaven();
        pizzaShop.takeOrder("123", "Pepperoni", 20.0);
        pizzaShop.processCardPayment("12345678901234", "12/25", 123);
        pizzaShop.specialOfTheDay("Hawaiian Pizza", "French Fries", "10.99");
    }
}