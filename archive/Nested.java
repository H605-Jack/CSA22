package archive;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        for (int i = 1; i <= width; i++) {
            for (int j = i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
