package Variables;

import java.util.Scanner;

public class Kontrol {
    public static void main (String[] args){
        System.out.println("Hello World");
        int rastgelesayi1 = (int) (Math.random() * 10) + 1;
        System.out.println(rastgelesayi1);
        int tahmin, kalanhaklar = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 10 arasında sayı seçtim tahmin etmeye çalış edemezsen kaybedersin");

        while(kalanhaklar > 0) {
            System.out.print("Tahmin ettiğin sayı: ");
            tahmin = scanner.nextInt();

            if (tahmin==rastgelesayi1) {
                System.out.println(" helal be aslanım doğru bildin");
                break;
            } else {
                kalanhaklar --;
                if (kalanhaklar > 0) {
                    System.out.println(" yanlış bildin, şu kadar hakkın kaldı: " + kalanhaklar);
                } else {
                    System.out.println("püh yazıklar olsun tahmin edemedin sayıyı kaybettin. tahmin edemediğin sayı:"  + rastgelesayi1 );


                }
            }
        }
scanner.close();


        







    }

}
