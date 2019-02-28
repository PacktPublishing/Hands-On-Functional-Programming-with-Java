import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){
        HashMap<String,Integer> namedNumbers = new HashMap<>();
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
