package archive.sample;

import java.util.Scanner;

public class U4HW2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        while (num1 <= num2) {
            if (num1%2 == 0) {
                System.out.print(num1 + " ");
            } 
            num1++;
        }        
    }
}
