//Create and Add Elements to ArrayList:
//Create an ArrayList to store the names of friends. Add 5 names to the list and print the list.
import java.util.ArrayList;
public class Assignment7_1 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Nguyen");
        friends.add("Huy");
        friends.add("Tu");
        friends.add("Tung");
        friends.add("Sac");
        System.out.println("Friends List: " + friends);
    }
}