package homework.U5HW1_Q10;

public class MyInteger {
    private int value;

    public MyInteger () {
        value = 1;
    }

    // Param constructor with signature int
    public MyInteger (int passedNum) {
        value = passedNum;
    }

    // Accessor: Public, return type: Boolean
    // Method Name: isEven, Params: none
    public boolean isEven() {
        if (value%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (value%2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPrime() {
        int counter = value - 1;
        for (int i = counter ; i >= 2; i--) {
            if (value % i == 0) {
                return false;
            } 
        }
        return true;
    }
}