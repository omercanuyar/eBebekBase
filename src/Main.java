import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking inputs and assinging them.
        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        //create an array of desired size
        int[] array = new int[n];

        //taking inputs and assinging to array
        for (int i=0; i<n; i++){
            System.out.println((i+1)+". sayıyı yazınız: (Her sayıdan sonra Enter'a basınız.)");
            array[i] = input.nextInt();
        }

        //sorting numbers in array
        Arrays.sort(array);

        //printing max and min numbers
        System.out.println("En küçük sayı: "+array[0]);
        System.out.println("En büyük sayı: "+array[n-1]);

    }
}