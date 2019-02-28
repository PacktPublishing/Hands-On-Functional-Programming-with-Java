import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsLinkedHash {
    public static void main(String [] args){
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(77);
        numbers.add(83);
        numbers.add(29);
        for (var num: numbers){
            System.out.println(num);
        }

    }
}
