iimport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> javaList = new LinkedList<Integer>();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            int L = sc.nextInt();
            javaList.add(L);
        }

        int Q = sc.nextInt();

        for (int i = 0; i < Q; i++){
            String query = sc.next();
            if (query.equalsIgnoreCase("insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                javaList.add(x, y);
            }
            if (query.equalsIgnoreCase("Delete")){
                int z = sc.nextInt();
                javaList.remove(z);
            }
        }

        String printList = "";

        for (int i = 0; i < javaList.size(); i++){
            printList += javaList.get(i) + " ";
        }

        System.out.println(printList);

    }
}