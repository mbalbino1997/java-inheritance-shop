public class Cuffie extends Prodotto {
    String colour;
    boolean isWireless;
    public Cuffie(int code, String name, String brand, double price, int iva, String colour, boolean isWireless) {
        super(code, name, brand, price, iva);
        this.colour=colour;
        this.isWireless=isWireless;
    }


}

