package wloops;

import java.util.Scanner;

public class Wloops {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        boolean quitCase = true;

        while (quitCase) {
            System.out.println("Pick from the following options: ");
            System.out.println("\t 1. Add\n\t 2. Subtract\n\t 3. Do something\n\t 4. Quit\n");
            System.out.print(":> ");
            int numChoice = scan.nextInt();
            if (numChoice > 4 || numChoice < 1) {
                System.out.println("You entered an invalid option. Reselect.");
            }
            if (numChoice == 4) {
                quitCase = false;
            }
        }
        System.out.println("The program has ended normally");
    }
}
