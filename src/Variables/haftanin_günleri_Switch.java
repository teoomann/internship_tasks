package Variables;
import java.util.Scanner;
public class haftanin_günleri_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ile 7 arasında bir sayi gir: ");
        int girilensayi = scanner.nextInt();
        switch (girilensayi) {
            case 1:
                System.out.println("pazartwsi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("1 ile 7 arasında bir rakam girmen lazım lütfen yeniden dene.");
                break;
        }
    }
}
