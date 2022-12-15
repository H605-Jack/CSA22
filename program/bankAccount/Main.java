package bankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CheckingAccount check = new CheckingAccount(700, "kiet");
        check.deposit(60);
        check.withdrawal(25);
        check.show();
    }
}
