package Variables;
import java.util.ArrayList;
public class remove_ornek {
    public static void main(String[] args) {

        ArrayList<String> lolCarList = new ArrayList<>();

        lolCarList.add("ahri");
        lolCarList.add("yasuo");
        lolCarList.add("jinx");
        lolCarList.add("Zed");

        System.out.println("lol karakterleri (Önce):");
        for (String champion : lolCarList) {
            System.out.println(champion);
        }

        lolCarList.remove("yasuo");

        System.out.println("\nlol karakterleri (midlane 0/10 gittikten sonra):");
        for (String champion : lolCarList) {
            System.out.println(champion);


        }
    }
}