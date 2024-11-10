/*
    Traverse the ArrayList:
    Create an ArrayList containing the names of 5 cities. Traverse the list and print each city name.
*/
import java.util.ArrayList;
public class Assignment7_3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("Can Tho");
        cities.add("Vung Tau");
        cities.add("Da Lat");
        cities.add("Ho Chi Minh");
        System.out.println("City Names:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}