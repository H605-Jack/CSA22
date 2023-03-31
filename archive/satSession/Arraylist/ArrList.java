package archive.satSession.Arraylist;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> abc = new ArrayList<String>();
        abc.add("T");
        abc.add("B");
        abc.add("S");
        abc.add("A");
        abc.set(2, "fred");
        for (int i = 0; i < abc.size(); i++) {
            System.out.println(abc.get(i));
        }
        int a = scan.nextInt();
        System.out.println(a);
    }
}
