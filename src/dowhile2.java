import java.util.Scanner;

public class dowhile2 {
    public static void main(String[] args) {
        int sum =0,i =1;




        // while loop continues
        // until entered number is positive
        while (i<5) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter two number");
            int number = input.nextInt();
            int number1 = input.nextInt();
            // add only positive numbers

            sum = number + number1;
            System.out.println("Sum = " + sum);
                i++;

        }




    }
}

