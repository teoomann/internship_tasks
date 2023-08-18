package Variables;
import java.util.ArrayList;
public class GetOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");
        String karakter = lolCarList.get(2);
        System.out.println("2. indeksteki oyuncu: " + karakter);
        System.out.println("\nTüm lol Karakterleri:");
        for (int i = 1; i < lolCarList.size(); i++) {
            System.out.println(i + " . indeksteki oyuncu: " + lolCarList.get(i));

        }
    }
}