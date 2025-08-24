import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SP: ");
        double sp = sc.nextDouble();

        Scanner si = new Scanner(System.in);
        System.out.print("Enter CP: ");
        double cp = si.nextDouble();

        if (sp > cp){
            System.out.println("Profit is "+(sp - cp));
            System.out.println("Profit Percentage is "+(((sp - cp)*100)/cp));
        }
        if (sp == cp){
            System.out.println("No Profit, No Loss");
        }
        if (sp < cp) {
            System.out.println("Loss is "+(cp - sp));
            System.out.println("Loss percentage is "+(((cp - sp)*100)/cp));
        }
    }
}
