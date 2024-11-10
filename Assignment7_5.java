/*
    Update an Element in ArrayList:
    Create an ArrayList containing integers from 1 to 5. Update the 3rd element to 100 and print the list.
*/
import java.util.ArrayList;
public class Assignment7_5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.set(2, 100);
        System.out.println("Danh sach sau khi cap nhat  " + numbers);
    }
}