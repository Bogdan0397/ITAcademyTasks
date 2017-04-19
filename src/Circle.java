import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by koqfl on 18.04.2017.
 */
public class Circle {
    public static void main(String[] args) throws IOException {
        double per, area;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String text  = r.readLine();
        double rad = Double.parseDouble(text);
        area = Math.PI*Math.pow(rad,2);
        per = 2*Math.PI*rad;
        System.out.println("area is: "+area+" perimetr is: "+per);

    }
}
