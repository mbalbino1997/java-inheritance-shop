public class Smartphone extends Prodotto {
private String IMEI;
private double memory;
    public Smartphone(int code, String name, String brand, double price, int iva,String IMEI,double memory) {
        super(code, name, brand, price, iva);
this.IMEI=IMEI;
this.memory=memory;
    }
    public String getIMEI() {
        return IMEI;
    }
    public void setIMEI(String iMEI) {
        IMEI = iMEI;
    }
    public double getMemory() {
        return memory;
    }
    public void setMemory(double memory) {
        this.memory = memory;
    }
    

}
 