import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.11;
        double patlicanFiyat = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        double armutKilo = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        double elmaKilo = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        double domatesKilo = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        double muzKilo = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKilo*armutFiyat)+(elmaKilo*elmaFiyat)+(domatesKilo*domatesFiyat)+(muzKilo*muzFiyat)+(patlicanKilo*patlicanFiyat);

        System.out.println("Toplam Tutar : "+toplamTutar+" TL");

    }
}