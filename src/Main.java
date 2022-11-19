import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //taking inputs and assinging them
        int number1, number2, select;
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz; ");
        number1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz; ");
        number2 = scanner.nextInt();

        //select operation
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = scanner.nextInt();

        //take action based on the given answer
        switch (select) {
            case 1:
                System.out.println("Sonuç: "+(number1+number2));
            break;
            case 2:
                System.out.println("Sonuç: "+(number1-number2));
            break;
            case 3:
                System.out.println("Sonuç: "+(number1*number2));
            break;
            case 4:
                System.out.println("Sonuç: "+(number1/number2));
            break;
        }
    }
}