package Variables;
import java.util.List;
import java.util.ArrayList;
public class indexof_ornek {
    public static void main(String[] args) {
        List<String> lolçarlar1 = new ArrayList<>();
        lolçarlar1.add("ahri");
        lolçarlar1.add("Ezreal");
        lolçarlar1.add("Garen");
        lolçarlar1.add("Lux");
        lolçarlar1.add("Zed");
        lolçarlar1.add("Jinx");
        lolçarlar1.add("Darius");
        String searchCharacter = "Zed";
        int index = lolçarlar1.indexOf(searchCharacter);
        if (index != -1) {
            System.out.println("Aranan karakter " + searchCharacter + " maçın indeksinde: " + index);
        } else {
            System.out.println("Aranan karakter maç içinde bulunamadı.");
        }
    }
}