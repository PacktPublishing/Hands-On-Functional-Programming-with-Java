import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String [] args){
        LinkedHashMap<Integer,String> namedNumbers = new LinkedHashMap<>();
        namedNumbers.put(1,"one");
        namedNumbers.put(76,"seventy six");
        namedNumbers.put(55,"fifty five");
        namedNumbers.put(3,"three");
        System.out.println(namedNumbers.get(55));

        System.out.println("The entry set: " + namedNumbers.entrySet());
        namedNumbers.remove(76);

        System.out.println("The values after removing 76: " + namedNumbers.values());
        System.out.println("The Keys: "+ namedNumbers.keySet());
    }
}
