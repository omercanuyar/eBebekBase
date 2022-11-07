import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taking variables and assinging them
        System.out.println("Gidilen mesafe kaç KM? :");
        double pathLength = scanner.nextDouble();

        double openingFee = 10;
        double feePerKM = 2.2;
        double totalFee;

        //controlling under 20 Liras with if statement
        if((pathLength * 2.2) + 10 < 20){
            totalFee = 20;
        }else totalFee = (pathLength * 2.2) + 10;

        //printing Total Fee
        System.out.println("Yapılacak ödeme: "+totalFee);
    }
}