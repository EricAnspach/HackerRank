import java.util.*;
import java.lang.StringBuilder;

public class JavaStringrReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String A = sc.next();
        String B = new StringBuilder(A).reverse().toString();

        System.out.println("Is it a palindrome?");
        if (A.equalsIgnoreCase(B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
