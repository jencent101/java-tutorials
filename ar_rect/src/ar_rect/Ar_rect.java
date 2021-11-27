
package ar_rect;
import java.util.Scanner;

public class Ar_rect {

    public static void main(String[] args) {
        int l, b;
        float ar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        l = sc.nextInt();
        b = sc.nextInt();
        ar = l * b;
        System.out.println("Area of circle: " + ar + " sq. units.");
    }
    
}
