import java.util.HashSet;

public class Sets {
    public static void main(String [] args){
        HashSet<String> names = new HashSet<>();
        names.add("Tywin");
        names.add("Cersei");
        names.add("Jon");
        for (var name:names){
            System.out.println(name);
        }
        names.remove("Jon");
        System.out.println(names.size());
    }
}
