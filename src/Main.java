import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //taking input and assigning to variables
        String outputBeginning = "Çin Zodyağı Burcunuz: ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int birthdate = scanner.nextInt();

        //switch case for months and printing
        switch (birthdate%12) {
            case 0:
                System.out.println(outputBeginning + "Maymun");
            case 1:
                System.out.println(outputBeginning + "Horoz");
            case 2:
                System.out.println(outputBeginning + "Köpek");
            case 3:
                System.out.println(outputBeginning + "Domuz");
            case 4:
                System.out.println(outputBeginning + "Fare");
            case 5:
                System.out.println(outputBeginning + "Öküz");
            case 6:
                System.out.println(outputBeginning + "Kaplan");
            case 7:
                System.out.println(outputBeginning + "Tavşan");
            case 8:
                System.out.println(outputBeginning + "Ejderha");
            case 9:
                System.out.println(outputBeginning + "Yılan");
            case 10:
                System.out.println(outputBeginning + "At");
            case 11:
                System.out.println(outputBeginning + "Koyun");
        }
    }
}