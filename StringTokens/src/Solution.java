import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String delimiters = "[ !,?._'@]+";

        String sTokens[] = s.trim().split(delimiters);

        if (s.trim().equals("")) {
            System.out.println("0");
        } else {
            System.out.println(sTokens.length);
            for (String sToken : sTokens) {
                System.out.println(sToken);
            }
        }

        scan.close();
    }
}