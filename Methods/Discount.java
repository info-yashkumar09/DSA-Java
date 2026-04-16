package Methods;

public class Discount {

    public static double getDiscountedPrice(double price, double discount){
        double discountedPrice = price * ((100-discount)/100);
        return discountedPrice;
    }

    public static void main(String[] args) {
        IO.println(getDiscountedPrice(430, 23));
    }
}
