import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int sum = 0;
        int highestSum = (-64);

        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                sum += arr[i][j];
                sum += arr[i][j+1];
                sum += arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j];
                sum += arr[i+2][j+1];
                sum += arr[i+2][j+2];
                if (sum > highestSum) {
                    highestSum = sum;
                }
                sum = 0;
            }
        }
        System.out.println(highestSum);
    }
}