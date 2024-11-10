/*
    Remove an Element from ArrayList:
    Create an ArrayList containing integers from 1 to 10. Remove the number 5 from the list and print the list after removal.
*/
import java.util.ArrayList;
public class Assignment7_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5)); 
        System.out.println("Updated List: " + numbers);
    }
}   