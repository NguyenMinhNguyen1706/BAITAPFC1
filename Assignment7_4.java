/*
    Search for an Element in ArrayList:
    Create an ArrayList with keywords like "Java", "Python", "C++", "JavaScript". Check if "Python" is in the list and print the result.
*/
import java.util.ArrayList;
public class Assignment7_4 {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        if (keywords.contains("Python")) {
            System.out.println("\"Python\" co trong danh sach.");
        } else {
            System.out.println("\"Python\" khong xuat hien trong danh sach.");
        }
    }
}