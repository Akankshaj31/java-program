import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cases {
    public static void main(String[] args) throws IOException {
        int day;
        System.out.println("enter the day number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        day = Integer.parseInt(br.readLine());

        System.out.println("enter the value of num:");
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("invalid number");

        }
    }
}
