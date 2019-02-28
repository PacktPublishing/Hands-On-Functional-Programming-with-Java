import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListLinkedList {
    public static void main(String[] args){
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        arrayNumbers.addAll(Arrays.asList(1,2,3,6,123,73,1234,98));
        System.out.println(arrayNumbers.get(3));
        arrayNumbers.set(3,42);
        System.out.println(arrayNumbers.get(3));


    }
}
