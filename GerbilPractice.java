import java.util.*;

class Gerbil {
    private static int cnt;
    private final int gerbilNumber = cnt++;

    public void hop() {
        System.out.println(gerbilNumber + " is hopping.");
    }
}

public class GerbilPractice {
    public static void main(String[] agrs) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            gerbils.add(new Gerbil());
        }
        for (Gerbil gerbil : gerbils) {
            gerbil.hop();
        }
    }
}