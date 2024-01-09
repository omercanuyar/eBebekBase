import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please write a number: If you write an odd number, it will stop.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ciftSayilar = new ArrayList<>();
        ArrayList<Integer> ciftVeDordunKatiSayilar = new ArrayList<>();
        int sum = 0;

        while (true){

            int number = scanner.nextInt();

            if (number % 2 == 0) {
                ciftSayilar.add(number);
            } else {
                break;
            }
        }

        for (int ciftSayi : ciftSayilar){
            if(ciftSayi % 4 == 0)
            ciftVeDordunKatiSayilar.add(ciftSayi);
        }

        if(Objects.nonNull(ciftVeDordunKatiSayilar)){
            for (int ciftVeDordunKatiSayi : ciftVeDordunKatiSayilar) {
                sum += ciftVeDordunKatiSayi;
            }
        }

        System.out.println("The sum of your list: "+ sum);

    }
}