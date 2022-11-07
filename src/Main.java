import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking variables and assinging them
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dik a kenarı uzunluğu: ");
        double a = scanner.nextDouble();

        System.out.println("Dik b kenarı uzunluğu: ");
        double b = scanner.nextDouble();

        //calculating hypotenuse
        double hypotenuse = Math.sqrt((a*a)+(b*b));

        //calculating PerimeterOfTriangle 2u / 2 = u
        double PerimeterOfTriangle = hypotenuse + a + b;
        double u = PerimeterOfTriangle / 2;

        //calculating area of triangle with -> area * area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double areaOfTriangle = Math.sqrt(u * (u-a) * (u-b) * (u-hypotenuse));

        //printing area of triangle and hypotenuse
        System.out.println("Hipotenüz uzunluğu: "+hypotenuse);
        System.out.println("Üçgenin alanı: " + areaOfTriangle);

    }
}