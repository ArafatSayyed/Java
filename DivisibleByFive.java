import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n%5 == 0){
            System.out.println("Divisible By 5");
        }
        else {
            System.out.println("Do Not Divisible By 5");
        }
    }
}
