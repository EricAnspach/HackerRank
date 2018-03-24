import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++){

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }

                if (sum < 0){
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}