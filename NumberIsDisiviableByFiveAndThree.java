import java.util.Scanner;

public class NumberIsDisiviableByFiveAndThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        if (x % 3 == 0 || x % 5 == 0){
            System.out.println("Divisible by Either 3 or 5");
        }
        else
        {
            System.out.println("Not Divisible by Either 3 or 5");
        }
    }
}
