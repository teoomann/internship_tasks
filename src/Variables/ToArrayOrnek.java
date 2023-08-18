package Variables;
import java.util.ArrayList;
public class ToArrayOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");
        String[] karakterDizisi = lolCarList.toArray(new String[0]);
        System.out.println("lol karakterleri (Dizi halinde):");
        for (String karakter : karakterDizisi) {
            System.out.println(karakter);
        }
    }
}