import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking inputs from user and assinging them
        int i,j,number;

        Scanner input = new Scanner(System.in);

        System.out.println("Basamak Sayısı : ");

        number = input.nextInt();

        //drawing reverse triangle
        //tr-- i azalırken j artacak i:yıldız, j:boşluk. satır satır atlanarak yazılacak.
        for(i = number; i >= 1; i--){

            for(j = i; j < number; j++){
                System.out.print(" ");
            }

            for(j = 1; j <= (2 * i - 1); j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}