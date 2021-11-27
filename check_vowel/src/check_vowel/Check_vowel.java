
package check_vowel;
import java.io.*;

public class Check_vowel {

    public static void main(String[] args) {
        char ch = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter a character: ");
            ch = (char) br.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (ch == 'a' || ch == 'A'
                || ch == 'e' || ch == 'E'
                || ch == 'i' || ch == 'I'
                || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            System.out.println("Vowel.");
        } else {
            System.out.println("Consonant.");
        }
    } 
    
}
