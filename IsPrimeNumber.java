import java.util.*;

public class IsPrimeNumber {
    static boolean isPrimeNumber(int num) {
        for (int i = 2; i < Math.abs(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] agrs) {
        for (int i = -100; i < 1000; i++) {
            if (isPrimeNumber(i))
                System.out.println(i);
        }
    }
}