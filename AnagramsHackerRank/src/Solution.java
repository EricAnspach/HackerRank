import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        char array1[] = a.toCharArray();
        char array2[] = b.toCharArray();

        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);

        return java.util.Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}