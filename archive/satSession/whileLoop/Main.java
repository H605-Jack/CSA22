package archive.satSession.whileLoop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int answer;

        System.out.println("Enter 1 to quit, another number to continue.");
        answer = scan.nextInt();

        while (answer != 1) {
            System.out.println("Good Choice");
            System.out.println("Enter 1 to quit, another number to continue.");
            answer = scan.nextInt();
        }

        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
        System.out.println("Program ended normally");

    }
}
