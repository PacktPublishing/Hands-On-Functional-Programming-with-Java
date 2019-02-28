import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        TreeMap<String,Integer> namedNumbers = new TreeMap<>(comparator);
        namedNumbers.put("one",1);
        namedNumbers.put("seventy six",76);
        namedNumbers.put("fifty five", 55);
        namedNumbers.put("three", 3);

        System.out.println(namedNumbers.get("one"));

        System.out.println("The entry set: " + namedNumbers.entrySet());
        namedNumbers.remove("fifty five");

        System.out.println("The values after removing 55: " + namedNumbers.values());
        System.out.println("The Keys: "+ namedNumbers.keySet());
    }
}
