
package armstrong_no;
import java.util.Scanner;

public class Armstrong_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, ld, sum = 0;
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        m = n;
        do {
             ld = n % 10;
             sum += ld * ld * ld;
             n /= 10;
        } while (n > 0);
        if (sum == 0) {
            System.out.println("Armstrong no.");
        } else {
            System.out.println("Not armstrong no.");
        }
    }
    
}
