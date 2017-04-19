package phone;

/**
 * Created by koqfl on 18.04.2017.
 */
public class Tarif {
   private String name;
   private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Tarif(String name, double price){
        setName(name);
        setPrice(price);
    }
    public double count(int t)
    {
        return this.getPrice()*t;
    }
}
