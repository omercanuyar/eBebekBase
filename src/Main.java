import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // define prices
        double  pearPrice = 2.14,
                applePrice = 3.67,
                tomatoPrice = 1.11,
                bananaPrice = 0.11,
                auberginePrice = 5;

        //taking inputs and assigning them
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        double pearKilogram = scanner.nextDouble();

        System.out.println("Elma Kaç Kilo ? :");
        double appleKilogram = scanner.nextDouble();

        System.out.println("Domates Kaç Kilo ? :");
        double tomatoKilogram = scanner.nextDouble();

        System.out.println("Muz Kaç Kilo ? :");
        double bananaKilogram = scanner.nextDouble();

        System.out.println("Patlıcan Kaç Kilo ? :");
        double aubergineKilogram = scanner.nextDouble();

        //calculating total price
        double totalPrice = (pearKilogram*pearPrice)+(appleKilogram*applePrice)+(tomatoKilogram*tomatoPrice)+(bananaKilogram*bananaPrice)+(aubergineKilogram*auberginePrice);

        //printing total price
        System.out.println("Toplam Tutar : "+totalPrice+" TL");

    }
}