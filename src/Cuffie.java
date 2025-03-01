public class Cuffie extends Prodotto {
    private String colour;
    private boolean isWireless;
    public Cuffie(int code, String name, String brand, double price, int iva, String colour, boolean isWireless) {
        super(code, name, brand, price, iva);
        this.colour=colour;
        this.isWireless=isWireless;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isWireless() {
        return isWireless;
    }
    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }
    
    @Override
    public String toString() {
        
        return super.toString()+ ". Colore delle cuffie:"+colour+", sono cuffie wireless:"+isWireless;
    }


}

