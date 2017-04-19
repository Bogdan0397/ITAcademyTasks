import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by koqfl on 18.04.2017.
 */
public class Person {
    public static void main(String[] args) throws IOException {
        int age;
        System.out.println("What is your name?");
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String name = n.readLine();
        System.out.println("Where are you live, "+name+"?");
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        String adress = a.readLine();
        System.out.println(" "+name+" "+adress);


    }
}
