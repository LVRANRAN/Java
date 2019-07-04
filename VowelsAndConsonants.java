import java.util.*;
import static net.mindview.util.Print.*;

public class VowelsAndConsonants {
    public static void main(String[] agrs) {
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + " " + c + ": ");
            switch (c) {
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                print("vowel.");
                break;
            case 'y':
            case 'w':
                print("sometimes a vowel.");
                break;
            default:
                print("consonant");
                break;
            }
        }
    }
}