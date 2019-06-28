import java.util.*;

//TBD
public class ClassificationRandomWhile {
    public static void main(String[] agrs) {
        int num1 = (int) Math.random();
        while (true) {
            int num2 = (int) Math.random();
            if (num1 < num2)
                System.out.println(num1 + " is smaller than " + num2);
            else if (num1 > num2)
                System.out.println(num1 + " is bigger than " + num2);
            else
                System.out.println(num1 + " is equal to " + num2);
            num1 = num2;
        }
    }
}