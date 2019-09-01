import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] agrs) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println((apples.get(i)).id());
        }
        for (Apple a : apples) {
            System.out.println(a.id());
        }
    }
}