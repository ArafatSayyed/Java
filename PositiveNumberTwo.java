import java.util.Scanner;

public class PositiveNumberTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n < 0) n = -n;{
            System.out.println(n);
        }
    }
}
