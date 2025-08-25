import java.util.Scanner;

public class RealNumberIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble();
        double x = (int)n;
        if (n - x == 0){
            System.out.println("Not Integer");
        }
        else {
            System.out.println("Integer");
        }

    }
}
/* smajh nhi aaya hai...*/
