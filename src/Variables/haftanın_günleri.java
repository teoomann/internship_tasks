package Variables;

import java.util.Scanner;
public class haftanın_günleri {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World");

        System.out.println("1 ile 7 arasında bir sayı gir");
        int girilensayi = scanner.nextInt();

        if (girilensayi == 1) {
            System.out.print("Pazartesi");
        } else if (girilensayi == 2) {
            System.out.print("Sali");
        } else if (girilensayi == 3) {
            System.out.print("çarşamba");
        } else if (girilensayi == 4) {
            System.out.print("perşembe");
        } else if (girilensayi == 5) {
            System.out.print("cuma");
        } else if (girilensayi == 6) {
            System.out.print("cumartesi");
        } else if (girilensayi == 7) {
            System.out.print("pazar");
        } else
        System.out.print("1 ile 7 arasında bir rakam girmen lazım lütfen tekrar dene");



    }
}
