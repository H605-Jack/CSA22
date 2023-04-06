package password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        PasswordManager newUser = new PasswordManager("rafealalala", "You are an ha ha ha ha");
        System.out.println("Your username is " + newUser.getUsername().toString() + " and your password is " + newUser.getPassword().toString());
        System.out.print("Suggest an edit? [Y/N] ");
        String confirm = scan.nextLine();
        if (confirm.equals("y")) {
            System.out.print("Enter username: ");
            String username = scan.nextLine();
            newUser.setUsername(username);
            System.out.print("Enter password: ");
            String password = scan.nextLine();
            newUser.setPassword(password);
            System.out.println("Your username is " + newUser.getUsername().toString() + " and your password is " + newUser.getPassword().toString());
        }
        System.out.println("Program exited with exit code Done");
    }
}
