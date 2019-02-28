import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoiningExample {
    public static void main(String[] args){
        String[] words = new String[]{"These", "are", "a", "few", "words", "used", "to", "describe"};
        //simple concat of these words
        String one =
                Arrays.stream(words)
                .collect(Collectors.joining());
        System.out.println(one);
        //concat the words with a delimiter
        String two =
                Arrays.stream(words)
                .collect(Collectors.joining("+"));
        System.out.println(two);
        //concat the words with a suffix and prefix
        String three =
                Arrays.stream(words)
                .collect(Collectors.joining(" ","Hello World "," the program"));
        System.out.println(three);
        //partition the words by testing if their length is even
        Map<Boolean,List<String>> part =
                Arrays.stream(words)
                .collect(Collectors.partitioningBy(w->w.length()%2==0));
        System.out.println(part);


    }
}
