/*import java.util.Scanner;
public class MagnitudeIsSmallerThanSixtynine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if (n>=0)
        {
            if (n<69)
            {
                System.out.println("Magnitude is smaller than 69");
            }
        }
        else
        {
            System.out.println(-n);
            System.out.println("Magnitude is smaller than 69");
        }
    }
}*/

import java.util.Scanner;

public class MagnitudeIsSmallerThanSixtynine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if (Math.abs(n) < 69) {
            System.out.println("Magnitude is smaller than 69");
        } else {
            System.out.println("Magnitude is not smaller than 69");
        }
    }
}
