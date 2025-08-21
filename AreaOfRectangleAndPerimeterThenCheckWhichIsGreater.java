import java.awt.geom.Area;
import java.util.Scanner;

public class AreaOfRectangleAndPerimeterThenCheckWhichIsGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();

        Scanner si = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int w = si.nextInt();

        int a,p;
        a = l*w;
        System.out.println("Area is"+a);
        p = 2*(l+w);
        System.out.println("Perimeter is"+p);

        if (a>p)
        {
            System.out.println("Area is greater than Perimeter");
        }
        else if (a==p)
        {
            System.out.println("Area is equal to perimeter");
        }
        else
        {
            System.out.println("Perimeter is greater than area");
        }
    }
}


























