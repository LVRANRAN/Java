import java.util.Random;

public class ClassificationRandomWhile {
    public static void main(String[] agrs) {
        Random rand = new Random(); // 实例化Random()
        int num1 = 0;
        while (true) {
            int num2 = rand.nextInt(100); // 产生一个100以内的整数
            System.out.print(num2);
            if (num1 == num2) {
                System.out.println(" = The previous number");
            } else if (num1 < num2) {
                System.out.println(" > The previous number");
            } else {
                System.out.println(" < The previous number");
            }
            num1 = num2;
        }
    }
}