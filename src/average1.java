import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class average1 {
    public static void main(String[] args) throws IOException {
        int x, y, z, i, a;
        int b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of x");
        y = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of y");
        z = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of z");
        i = Integer.parseInt(br.readLine());
        System.out.println("Enter the value i");
        a = Integer.parseInt(br.readLine());
        b = (x + y + z + i + a) / 5;
        System.out.println(b);
        if (b >= 90)
        {
            System.out.println("you get smart watch");
        }

    }
}
