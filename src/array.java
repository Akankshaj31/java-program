
import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Samsung");
        arr.add("Nokia");
        arr.add("One-plus");
        arr.add("I-phone");
        System.out.println("phone");
        System.out.println(arr.get(3));
        System.out.println(arr.size());
        arr.remove( 3);
        System.out.println(arr.size());
        System.out.println(arr);

    }
}
