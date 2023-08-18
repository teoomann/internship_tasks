package Variables;
import java.util.ArrayList;
public class AddOrnek {
    public static void main(String[] args) {
        ArrayList<String> lolCarList = new ArrayList<>();
        lolCarList.add("Ahri");
        lolCarList.add("Yasuo");
        lolCarList.add("Jinx");
        lolCarList.add("Zed");
        System.out.println("Lol karakterleri:");
        for (String champion : lolCarList) {
            System.out.println(champion);

        }
    }
}