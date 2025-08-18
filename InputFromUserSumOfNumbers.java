package Basic;
import java.util.Scanner;

public class InputFromUserSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int z = sc.nextInt();
        System.out.print("Sum of Number is: ");
        System.out.print(x+y+z);
    }
}
