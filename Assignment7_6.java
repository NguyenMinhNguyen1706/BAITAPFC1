/*
    Convert ArrayList to Array:
    Create an ArrayList with 5 integers. Convert this ArrayList to an array and print each element of the array.
*/
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(4);
        Collections.sort(numbers);    
        System.out.println("Sorted list: " + numbers);
    }
}
