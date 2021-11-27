
package ar_circle;
import java.util.Scanner;

public class Ar_circle {

    public static void main(String[] args) {
        int r;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = sc.nextInt();
        area = 3.14f * r * r;
        System.out.println("Area of circle: " + area + " sq. units.");
    }
    
}
