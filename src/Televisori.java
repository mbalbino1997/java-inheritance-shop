public class Televisori extends Prodotto{
    double size;
    boolean isSmart;
    public Televisori(int code, String name, String brand, double price, int iva, double size, boolean isSmart) {
        super(code, name, brand, price, iva);
        this.size=size;
        this.isSmart=isSmart;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public boolean isSmart() {
        return isSmart;
    }
    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
    

}
