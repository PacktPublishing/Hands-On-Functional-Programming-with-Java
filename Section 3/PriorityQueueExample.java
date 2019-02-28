import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args){
        PriorityQueue<String> languages = new PriorityQueue<>();
        languages.add("French");
        languages.add("Swahili");
        languages.add("Japanese");
        languages.add("English");
        Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        languages.add("Arabic");
        for (var lang:languages){
            System.out.println(lang);
        }


    }
}
