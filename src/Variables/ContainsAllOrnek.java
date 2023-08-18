package Variables;
import java.util.ArrayList;
import java.util.Arrays;
public class ContainsAllOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");

        ArrayList<String> arananKarakterler = new ArrayList<>(Arrays.asList("Ahri", "Yasuo", "Jinx"));

        if (lolCarList.containsAll(arananKarakterler)) {
            System.out.println("Aranan oyuncu listede bulunuyor.");
        } else {
            System.out.println("Aranan oyuncular listede bulunmuyor.");
        }
    }
}