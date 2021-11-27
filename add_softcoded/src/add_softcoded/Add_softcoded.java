
package add_softcoded;
import java.io.*;

public class Add_softcoded {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, y, sum;
        System.out.println("Enter a first number: ");
        x = Integer.parseInt(br.readLine());
        System.out.println("Enter a second number: ");
        y = Integer.parseInt(br.readLine());
        sum = x + y;
        System.out.println("The sum is: " + sum);
    }
}
