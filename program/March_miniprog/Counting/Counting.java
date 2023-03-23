package March_miniprog.Counting;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int negCount = 0;
        int posCount = 0;
        double sum = 0;

        int entry;
        do {
            System.out.print("Please enter a number: ");
            entry = scan.nextInt();
            if (entry < 0) {
                negCount++;
                sum += entry;
            } else if (entry > 0) {
                posCount++;
                sum += entry;
            } 
        } while (entry != 0);

        int totalCount = negCount + posCount;
        double avg = sum/totalCount;
        System.out.println("You entered " + posCount + " positive numbers.");
        System.out.println("You entered " + negCount + " positive numbers.");
        System.out.println("The average of your numbers is " + avg);
    }
}
