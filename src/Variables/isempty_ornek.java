package Variables;
import java.util.ArrayList;
import java.util.Arrays;

public class isempty_ornek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        System.out.println("lol karakterleri (Önce):");
        if (lolCarList.isEmpty()) {
            System.out.println("oyuncu yok.");
        } else {
            for (String karakter : lolCarList) {
                System.out.println(karakter);
            }
        }

        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");

        System.out.println("\n lol karakterleri  (Sonra):");
        if (lolCarList.isEmpty()) {
            System.out.println("oyuncular geldi .");
        } else {
            for (String karakter : lolCarList) {
                System.out.println(karakter);


            }
        }
    }
}