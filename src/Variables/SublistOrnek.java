package Variables;
import java.util.ArrayList;
import java.util.List;
public class SublistOrnek {
    public static void main(String[] args) {
        List<String> lolçarlar1 = new ArrayList<>();
        lolçarlar1.add("ahri");
        lolçarlar1.add("ezreal");
        lolçarlar1.add("garen");
        lolçarlar1.add("lux");
        lolçarlar1.add("zed");
        lolçarlar1.add("jinx");
        lolçarlar1.add("darius");
        System.out.println("lol karakterleri önce:");
        for (String character : lolçarlar1) {
            System.out.println(character);
            List<String> subCharacters = lolçarlar1.subList(2, 5);
            System.out.println("lol karakterleri sublist");
            for (String subCharacter : subCharacters) {
                System.out.println(subCharacter);

            }
        }
    }
}