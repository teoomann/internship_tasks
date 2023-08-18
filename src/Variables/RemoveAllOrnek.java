package Variables;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveAllOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");

        System.out.println("lol Karakterleri (önce):");
        for (String karakter : lolCarList) {
            System.out.println(karakter);
        }

        ArrayList<String> karakterlerToRemove = new ArrayList<>(Arrays.asList("Yasuo", "Zed"));
        lolCarList.removeAll(karakterlerToRemove);

        System.out.println("\nlol karakterleri mid ve top 0/20 gittikten sonra:");
        if (lolCarList.isEmpty()) {
            System.out.println("liste boş.");
        } else {
            for (String karakter : lolCarList) {
                System.out.println(karakter);
            }
        }
    }
}