package EmailBreakDown;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("User input: ");
        String email = scan.nextLine();
        Email e = new Email(email);
        e.getEmailBreakdown();
    }
}
