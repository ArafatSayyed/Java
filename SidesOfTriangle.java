import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Side Of Triangle: ");
        int a = sc.nextInt();
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter Second Side Of Triangle: ");
        int b = sa.nextInt();
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Third Side Of Triangle: ");
        int c = sb.nextInt();
        if (a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Its a Triangle");
        }
        else
        {
            System.out.println("Its not a Triangle");
        }


    }
}
