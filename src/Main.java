import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking inputs and assinging to variables
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz :");
        int year = scanner.nextInt();
        //if statement to being or not a leap year and printing output
        if(year%4==0 && year%100!=0){
            System.out.println(year+" bir artık yıldır !");
        } else if (year%400==0) {
            System.out.println(year+" bir artık yıldır !");
        }else System.out.println(year+" bir artık yıl değildir !");
    }
}