public class Prodotto {
private int code;
private String name;
private String brand;
private double price;
private int iva;
public Prodotto(int code, String name, String brand, double price, int iva) {
    this.code = code;
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.iva = iva;
}
public int getCode() {
    return code;
}
public void setCode(int code) {
    this.code = code;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBrand() {
    return brand;
}
public void setBrand(String brand) {
    this.brand = brand;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getIva() {
    return iva;
}
public void setIva(int iva) {
    this.iva = iva;
}

}
