import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking variables and assinging them
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz: ");
        double radius = scanner.nextDouble();

        System.out.println("Merkez açısının ölçüsü giriniz: ");
        double slice = scanner.nextDouble();

        //calculating area and area of slice
        double area = radius * radius * pi;

        double sliceArea = area * slice / 360;

        //printing area and area of slice
        System.out.println("Yarıçapı "+radius+" olan dairenin alanı: "+area);
        System.out.println("Yarıçapı "+radius+" olan, merkez açısının ölçüsü olan daire diliminin alanı: "+sliceArea);
    }
}