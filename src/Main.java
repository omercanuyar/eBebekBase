import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking inputs from inputs and assinging them
        int count=0,sum=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sınır belirleyiniz: ");
        int number = scan.nextInt();

        //sum all numbers that can divide 3 OR 4.
        for (int i=0;i<=number;i++){
            if(i%12==0){
                sum += i;
                count++; //counter count
            }
        }
        //printing average of sums
        System.out.println("Ortalamaları: "+(sum/count));
    }
}