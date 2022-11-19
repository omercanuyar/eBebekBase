import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int date, month;
            Scanner sc = new Scanner(System.in);
            System.out.println("input your date : ");
            date = sc.nextInt();

            System.out.println("input your mounth: ");
            month = sc.nextInt();

            if ((date>21 && month == 12) || (date<=19 && month== 1)){
                System.out.println("your zodiac is Capricon");
            }
            if ((date>20 && month ==1) || (date<=18 && month == 2)){
                System.out.println("your zodiac is Aquarius");
            }
            if ((date>19 && month == 2) || (date <=20 && month == 3)){
                System.out.println("your zodiac is Pisces");
            }
            if ((date>21 && month == 3) || (date <=20 && month == 4)){
                System.out.println("your zodiac is aries");
            }
            if ((date>21 && month == 4) || (date <=20 && month == 5)){
                System.out.println("your zodiac is Taurus");
            }
            if ((date>21 && month == 5) || (date<=20 && month == 6)){
                System.out.println("your zodiac is Gemini");
            }
            if ((date>21 && month == 6) || (date<=20 && month == 7)){
                System.out.println("your zodiac is Cancer");
            }
            if ((date>21 && month  == 7) || (date<=20 && month== 8)){
                System.out.println("your zodiac is  Leo");
            }
            if ((date>21 && month ==8) || (date<=22 && month == 9)){
                System.out.println("your zodiac is Virgo");
            }
            if ((date>23 && month == 9) || (date<=20 && month ==10)){
                System.out.println("your zodiac is Libra");
            }
            if ((date>21 && month == 10) || (date<=22 && month == 11)){
                System.out.println("your zodiac is Scorpio");
            }
            if ((date>23 && month == 11) || (date<=20 && month == 12)){
                System.out.println("your zodiac is Sagitarius");
            }
        }
    }