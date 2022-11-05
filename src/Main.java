import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //taking inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your Math grade:");
        float math = scanner.nextFloat();

        System.out.println("Your Physics grade:");
        float physics = scanner.nextFloat();

        System.out.println("Your Chemistry grade:");
        float chemistry = scanner.nextFloat();

        System.out.println("Your Turkish grade:");
        float turkish = scanner.nextFloat();

        System.out.println("Your History grade:");
        float history = scanner.nextFloat();

        System.out.println("Your Music grade:");
        float music = scanner.nextFloat();

        //calculating average and print status without using if statement
        float average = (math + physics + chemistry + turkish + history + music)/6;
        boolean result = average >= 60;

        String status = result ? "Geçtiniz":"Kaldınız";
        System.out.println("Ortalamanız: "+average+" "+status);

    }

}