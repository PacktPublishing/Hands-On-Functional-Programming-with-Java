import java.util.Arrays;

public class ReduceOps {
    public static void main(String[] args){
        String[] words = new String[]{"expect","salad","blow"
                ,"harmony","committee","manage","field","flavor"};
        String largestWord =
                Arrays.stream(words)
                .reduce((w1,w2)->w1.length()>w2.length() ? w1 : w2)
                .get();
        System.out.println(largestWord);
        Integer sumOfLengths =
                Arrays.stream(words)
                .mapToInt(w->w.length())
                .reduce(0,(w1,w2)->w1+w2);
        System.out.println(sumOfLengths);
        String combined =
                Arrays.stream(words)
                .reduce((w1,w2)->w1+"--"+w2).get();
        System.out.println(combined);




    }
}
