package archive.satSession.whileLoop;

public class Loop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            System.out.println(count);
            count+=3;
        }

        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " ");
        }
    }
}
