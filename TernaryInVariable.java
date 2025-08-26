import java.util.Scanner;

public class TernaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int Arafat = (n>=0) ? 100 : 0;
        System.out.println(Arafat);
    }
}
