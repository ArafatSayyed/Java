package Basic;

import java.util.Scanner;

public class InputFromUserSquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        System.out.print("Square of a number is: ");
        System.out.print(x*x);
    }
}
