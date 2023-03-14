package March_miniprog.Randguess;

import java.util.Scanner;

public class Randguess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double purerand = (100 * Math.random()) + 1;
        int randnum = (int)purerand;
        for (int guessTime = 1; guessTime > 0; guessTime++) {
            System.out.print("Enter your guess: ");
            int entry = scan.nextInt();
            if (entry != randnum) {
                if (entry < randnum) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            } else {
                System.out.println("You got it! It took you " + guessTime + " guesses.");
                break;
            }
        }
    }
}
