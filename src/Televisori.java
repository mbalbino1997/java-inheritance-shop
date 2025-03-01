public class Televisori extends Prodotto{
    private double size;
    private boolean isSmart;
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

    @Override
    public String toString() {
        
        return super.toString()+ ". Dimensioni della TV:"+size+"pollici, è una smartTV:"+isSmart;
    }
    

}
