import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float kdvRate = 0, kdv = 0;

        //taking inputs and assinging to variables
        System.out.println("Tutar giriniz: ");
        float amount = input.nextFloat();

        //kdv conditions with if statement
        if (amount<1000){
            kdvRate = (float) 0.18;
        } else if (amount>=1000) {
            kdvRate = (float) 0.08;
        }

        //calculating kdv
        kdv = kdvRate * amount;

        //printing kdv
        System.out.println("KDV tutarı: "+kdv);
    }
}