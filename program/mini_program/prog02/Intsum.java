package mini_program.prog02;

import java.util.Scanner;

public class Intsum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Please enter a number: ");
            int entry = scan.nextInt();
            if (entry == 0) {
                i = 10;
            } else {
                sum += entry;
            }
        } 
        System.out.println("The sum of the numbers is "+sum);
    }
}
