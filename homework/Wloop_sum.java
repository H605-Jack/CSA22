package homework;

import java.util.Scanner;

public class Wloop_sum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum+=i;
            i++;
        }
        System.out.println("The sum from 0 to " + num + " is " + sum);
    }
}
