import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 3000;
        int select;
        while(right > 0 ){

            System.out.println("Hoşgeldiniz \nKullanıcı adınızı giriniz: ");
            String userName = sc.nextLine();

            System.out.println("Şifrenizi giriniz: ");
            String password = sc.nextLine();

            if(userName.equals("Demir") && password.equals("sayin")){

               do {
                   System.out.println("Hoşgeldiniz " + userName + "hangi işlemi yapmak istersiniz" +
                           "\n1.Para Yatırmak." +
                           "\n2.Para çekmek." +
                           "\n3.Bakiye sorgulama" +
                           "\n4. Çıkış");
                   select = sc.nextInt();

                   switch (select){

                       case 1:
                           System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                           int price = sc.nextInt();
                           balance += price;
                           break;

                       case 2:
                           System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                           price = sc.nextInt();

                           if(price > balance){
                               System.out.println("Çekmek istediğiniz tutar bakiyenizden yüksek!");
                           }
                           else {
                               balance -= price;
                               System.out.println("İşlem tamamlanmıştır.");
                           }
                       break;

                       case 3:
                           System.out.println("Toplam bakiyeniz: " + balance);
                           break;



                   }

               }while (select != 4);





            }
            else {
                    right--;
                System.out.println("Kullanıcı adı veya şifre yanlış kalan deneme hakkınız: " + right);
            }


            right = 0;


        }

    }

}
