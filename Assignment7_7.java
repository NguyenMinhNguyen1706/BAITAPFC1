/*
    Convert ArrayList to Array:
    Create an ArrayList with 5 integers. Convert this ArrayList to an array and print each element of the array.
*/
import java.util.ArrayList;
public class Assignment7_7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(50);
        numbers.add(75);
        numbers.add(100);
        numbers.add(125);
        Integer[] array = new Integer[numbers.size()];
        array = numbers.toArray(array);
        System.out.println("Cac phan tu trong mang la:");
        for (Integer num : array) {
            System.out.println(num);
        }
    }
    
}
