
package continue_demo;

public class Continue_demo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i + ",");
            }
        }
    }
    
}
