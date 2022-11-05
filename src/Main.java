import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //taking input and assigning to variables
        String outputStarter = "Çin Zodyağı Burcunuz: ";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz :");
        int birthdate = scanner.nextInt();

        //if statements for months and printing
        if (birthdate%12==0){
            System.out.println(outputStarter+"Maymun");
        } else if (birthdate%12==1) {
            System.out.println(outputStarter+"Horoz");
        } else if (birthdate%12==2) {
            System.out.println(outputStarter+"Köpek");
        } else if (birthdate%12==3) {
            System.out.println(outputStarter+"Domuz");
        } else if (birthdate%12==4) {
            System.out.println(outputStarter+"Fare");
        } else if (birthdate%12==5) {
            System.out.println(outputStarter+"Öküz");
        } else if (birthdate%12==6) {
            System.out.println(outputStarter+"Kaplan");
        } else if (birthdate%12==7) {
            System.out.println(outputStarter+"Tavşan");
        } else if (birthdate%12==8) {
            System.out.println(outputStarter+"Ejderha");
        } else if (birthdate%12==9) {
            System.out.println(outputStarter+"Yılan");
        } else if (birthdate%12==10) {
            System.out.println(outputStarter+"At");
        }else System.out.println(outputStarter+"Koyun");
    }
}