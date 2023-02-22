import java.util.Scanner;

class circle1 {
    int rad;
    public void set(int radius){
        this.rad=radius;
    }
    public int getRad(){
        return rad;
    }
    public double area()
    {
        double z=3.14*rad*rad;
        return z;
    }

}

public class getterandsetter {

    public static void main(String[] args) {
        circle1 c=new circle1();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Radius");
        int a= sc.nextInt();
        c.set(a);
        c.area();
        System.out.println(c.getRad());
        System.out.println(c.area());

    }
}