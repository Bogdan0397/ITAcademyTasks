package phone;

/**
 * Created by koqfl on 18.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Tarif c1 = new Tarif("USA",20);
        Tarif c2 = new Tarif("UK",30);
        Tarif c3 = new Tarif("UA",40);
        System.out.println("Tarif is "+ c1.count(2));
        System.out.println("Tarif is "+ c2.count(4));
        System.out.println("Tarif is "+ c3.count(5));
        double summ = c1.count(2)+c2.count(4)+c3.count(5);
        System.out.println(summ);

    }



}
