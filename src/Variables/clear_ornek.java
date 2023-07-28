package Variables;
import java.util.ArrayList;
import java.util.List;
public class clear_ornek {
    public static void main(String[] args) {
        List<String> lolçarlar1 = new ArrayList<>();
        lolçarlar1.add("ahri");
        lolçarlar1.add("ezreal");
        lolçarlar1.add("garen");
        lolçarlar1.add("lux");
        lolçarlar1.add("zed");
        lolçarlar1.add("jinx");
        lolçarlar1.add("darius");
        System.out.println("lobide:");
        for (String character : lolçarlar1) {
            System.out.println(character);
        }
       lolçarlar1.clear();
        System.out.println("maçtan sonra:");
        if (lolçarlar1.isEmpty()) {
            System.out.println("kimse yok.");
        } else {
            for (String character : lolçarlar1) {
                System.out.println(character);
            }
        }
    }
}