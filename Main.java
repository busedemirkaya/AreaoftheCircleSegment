import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: " );
        r = inp.nextInt();
        System.out.print("Enter the Measure of the Central Angle of the Slice of the Circle: " );

        a = inp.nextInt();

        double are = (pi * (r*r)*a)/360;
        System.out.print("Area of the Circle Segment: " + area);


    }
}