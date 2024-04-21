package EntitiesStatic;

public class DollarPrice {
    public static double dollarPrice;
    public static double quantityDollar;


    public static double totalBought() {
        return dollarPrice * quantityDollar;
    }

    public static double iof() {
        return totalBought() * 0.06;
    }

    public static double totalReais() {
        return iof() + totalBought();
    }

}
