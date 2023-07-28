package Variables;
import java.util.HashMap;
import java.util.Map;
public class Sinifnothesaplama {
    public static void main(String[] args) {
        Map<Integer, String> ogrenciIsimleri = new HashMap<>();
        ogrenciIsimleri.put(101, "Ali");
        ogrenciIsimleri.put(102, "Zeynep");
        ogrenciIsimleri.put(103, "Bilal");
        ogrenciIsimleri.put(104, "Teoman");
        ogrenciIsimleri.put(105, "Tuğba");

        Map<Integer, Integer> ogrencinotlari = new HashMap<>();
        ogrencinotlari.put(101, 85);
        ogrencinotlari.put(102, 78);
        ogrencinotlari.put(103, 92);
        ogrencinotlari.put(104, 68);
        ogrencinotlari.put(105, 95);

        int toplamNot = 0;
        int minNot = Integer.MAX_VALUE;
        int maxNot = Integer.MIN_VALUE;

        String enDusukNotAlanOgrenci = "";
        String enYuksekNotAlanOgrenci = "";

        for (Map.Entry<Integer, Integer> entry : ogrencinotlari.entrySet()) {
            int ogrenciNo = entry.getKey();
            int not = entry.getValue();
            String ogrenciAdi = ogrenciIsimleri.get(ogrenciNo);

            toplamNot += not;

            if (not < minNot) {
                minNot = not;
                enDusukNotAlanOgrenci = ogrenciAdi;
            }

            if (not > maxNot) {
                maxNot = not;
                enYuksekNotAlanOgrenci = ogrenciAdi;
            }
        }

        int ogrenciSayisi = ogrencinotlari.size();
        double ortalamaNot = (double) toplamNot / ogrenciSayisi;

        System.out.println("en düşük not alan öğrenci (sınıfın rezili): " + enDusukNotAlanOgrenci + " (" + minNot + ")");
        System.out.println("en yüksek not alan öğrenci (inek): " + enYuksekNotAlanOgrenci + " (" + maxNot + ")");
        System.out.println("Sınıfın ortalaması: " + ortalamaNot);







    }
}
