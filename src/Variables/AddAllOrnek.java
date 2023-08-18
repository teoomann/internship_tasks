package Variables;
import java.util.ArrayList;
import java.util.Arrays;
public class AddAllOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        ArrayList<String> yeniKarakterler = new ArrayList<>(Arrays.asList("Ahri", "Yasuo", "Jinx", "Zed"));
        lolCarList.addAll(yeniKarakterler);
        System.out.println("LOL Karakterleri:");
        for (String karakter : lolCarList) {
            System.out.println(karakter);
        }
    }
}