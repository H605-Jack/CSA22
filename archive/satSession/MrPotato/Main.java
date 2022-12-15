package archive.satSession.MrPotato;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
        MrPotato sam = new MrPotato();
        MrPotato sally = new MrPotato(2, "green", "brown", 4, "none");
        sam.talk();
        sam.changeEyes(1);
        sam.talk();
        System.out.println("Sam's beard is " + sam.theBeard());
        System.out.println("Sally's beard is " + sally.theBeard());
        System.out.println("Program Exited with Exit code 0");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Program Exited with Exit code 1");
        }
    }
}