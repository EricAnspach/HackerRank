import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            sc.nextLine();
            phoneBook.put(name, phone);
        }

        while(sc.hasNext()) {
            String s = sc.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }

        }
    }
}
