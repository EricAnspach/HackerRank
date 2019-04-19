import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfArrays = sc.nextInt();
        ArrayList<ArrayList<Integer>> aList = new ArrayList<>(numOfArrays);

        for (int i = 0; i < numOfArrays; i++) {

            int numOfInts = sc.nextInt();
            ArrayList<Integer> bList = new ArrayList<>(numOfInts);

            for (int j = 0; j < numOfInts; j++) {
                bList.add(sc.nextInt());
            }
            aList.add(bList);
        }

        int numOfQueries = sc.nextInt();

        for (int i = 0; i < numOfQueries; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(aList.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}