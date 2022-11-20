import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //assinging variables
        int counter = 0, i, j;

        //finding prime numbers with for loop
        for(i = 2; i <=100 ; i++){

            for(j = 2; j < i; j++) {

                if(i % j == 0){
                    counter++;
                    break;
                }
            }

            //printing found prime numbers
            if(counter == 0)

                System.out.print(i + " ");

            counter = 0;
        }
    }
}