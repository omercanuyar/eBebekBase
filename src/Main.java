import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double discount, tripTypeDiscount;

        //taking inputs to assinging variables
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :");
        double distance = scanner.nextDouble();

        System.out.println("Yaşınızı giriniz :");
        double age = scanner.nextDouble();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int tripType = scanner.nextInt();

        //check distance and age
        if((distance<0 | age<0)){
            System.out.println("Hatalı Veri Girdiniz !");
            System.exit(0);
        }

        //calculating price about age
        double price = distance * 0.1;

        if(age<12){
            discount = price * 0.5;
            price = price - discount;
        } else if (age>12 && age<24) {
            discount = price * 0.1;
            price = price - discount;
        } else if (age>65) {
            discount = price * 0.3;
            price = price - discount;
        }

        //calculating price about trip type 1 and 2 requirements
        switch (tripType){
            case 1:
                break;
            case 2:
                tripTypeDiscount = price * 0.2;
                price = price - tripTypeDiscount;
                price = price * 2;
                break;
            default:
                System.out.print("Hatalı bir değer girdiniz!");
        }

        //print price
        System.out.println("Toplam Tutar = "+price+" TL");

    }
}