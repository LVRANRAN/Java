
public class ForTest {
    public static void main(String[] agrs) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("Value: " + (int) c + " Character: " + c);
    }
}