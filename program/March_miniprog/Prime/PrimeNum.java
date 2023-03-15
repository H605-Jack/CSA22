package March_miniprog.Prime;

public class PrimeNum {
    public static void main(String[] args) {
        int numtest = 2;
        int i = 1;
        boolean isPrime = false;

        while (i<=50) {
            int range = 2; // inital divisor 
            // do-while
            // check if testing number including 2
            do {
                if (numtest % range == 0 && numtest != 2) {
                    isPrime = false;
                    numtest++;
                    break;
                } else if (numtest >= 2) {
                    isPrime = true;
                }
                range++;
            } while (range < numtest);
            
            // check for prime 
            if (isPrime == true) {
                System.out.print(numtest + " ");
                if (i % 10 == 0) {
                    System.out.println();
                }
                numtest++;
                i++;
            }
        }
    }
}
