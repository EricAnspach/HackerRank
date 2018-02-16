import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for(int i = 1; (i+k)<=s.length(); i++){
            String nextSubstring = s.substring(i, (i+k));
            if (smallest.compareTo(nextSubstring) > 0) {
                smallest = nextSubstring;
            }

            if (largest.compareTo(nextSubstring) < 0){
                largest = nextSubstring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}