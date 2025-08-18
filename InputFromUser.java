package Basic;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);


    }


}
