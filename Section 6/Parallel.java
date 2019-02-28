import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parallel {
    public static void main(String[] args){
        //count the even numbers from 0 to one billion
        long startTime = System.currentTimeMillis();
        long counted = IntStream.rangeClosed(0,1000000000)
                .parallel()
                .filter(i->i%2==0)
                .count();
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("the number of evens: "+counted + "time for execution: "+duration);
        //2399 millis
        //655 millis

    }
}
