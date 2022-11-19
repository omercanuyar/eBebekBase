import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[3];

        System.out.println("3 sayı yazınız: (Her sayıdan sonra Enter'a basınız.)");

        for (int i=0; i<3; i++){
            array[i] = input.nextInt();
        }

        Arrays.sort(array);

        for (int j=0; j<3; j++){
            System.out.println(array[j] + " ");
        }


    }
}