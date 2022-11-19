import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, oldPassword, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız:");
        userName = input.nextLine();

        System.out.println("Şifreniz:");
        oldPassword = input.nextLine();

        if (userName.equals("patika") && oldPassword.equals("java123")){
            System.out.println("Hoşgeldiniz!");
        } else if (userName.equals("patika") && !oldPassword.equals("java123")){
            System.out.println("Yanlış şifre girdiniz!");
            System.out.println("Yeni şifre oluşturmak ister misiniz?\nEvet için 1'i,\nHayır için 2'yi tuşlayınız.");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.println("Yeni şifrenizi giriniz:");
                    newPassword = input.nextLine();
                    if(oldPassword.equals(newPassword)){
                        System.out.println("Şifreniz eskisiyle aynı olamaz.");
                        break;
                    }else{
                        System.out.println("Şifrenizi başarıyla oluşturdunuz.");
                        break;
                    }
                case 2:
                    break;
            }
        }
    }
}