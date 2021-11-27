
package calc_demo;
import java.util.Scanner;

public class Calc_demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a first number: ");
        a = sc.nextInt();
        System.out.println("Enter a second number: ");
        b = sc.nextInt();
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d % %d = %d", a, b, a % b);
    }
    
}
