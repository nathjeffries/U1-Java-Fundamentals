public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {

    double gamePrice = 60.00;
    double discount = 20.00;
    double salePrice = (1-discount/100) * gamePrice;

        System.out.println("Discounted price: " +salePrice);
    }
}
