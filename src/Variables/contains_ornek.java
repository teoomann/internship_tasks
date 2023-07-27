package Variables;
import java.util.ArrayList;
public class contains_ornek {
    public static void main(String[] args) {

        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");

        String arananKarakter = "Yasuo";

        if (lolCarList.contains(arananKarakter)) {
            System.out.println(arananKarakter + " karakteri listede bulunuyor.");
        } else {
            System.out.println(arananKarakter + " karakteri listede bulunmuyor.");


        }
    }
}