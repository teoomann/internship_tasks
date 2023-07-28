package Variables;
import java.util.HashSet;
import java.util.Set;
public class set_ornek {
    public static void main(String[] args) {
        Set<String> lolCharacters = new HashSet<>();
        lolCharacters.add("ahri");
        lolCharacters.add("ezreal");
        lolCharacters.add("garen");
        lolCharacters.add("lux");
        lolCharacters.add("zed");
        lolCharacters.add("jinx");
        lolCharacters.add("darius");
        lolCharacters.add("yasuo");
        System.out.println("LOL Karakterleri:");
        for (String character : lolCharacters) {
            System.out.println(character);
        }
    }
}