
import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Map<Character, Integer> freq = new HashMap<>();
        freq.put('a', 4);
        freq.put('b', 6);
        freq.put('c', 8);

        System.out.println(freq);

        freq.put('a', freq.getOrDefault('a', 0) + 3);
        System.out.println(freq);
        freq.put('a', freq.getOrDefault('a', 0) + 3);
        System.out.println(freq);
    }
}
