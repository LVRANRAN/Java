

public class CommaOperator {
    public static void main(String[] agrs) {
        for (int i = 0, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}