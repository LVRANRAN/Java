

public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] agrs) {
        while (condition())
            System.out.println("Inside 'while'");
        System.out.println("Outside 'while'");
    }
}