package Variables;public class string_kutuphanesi_ornek {
    public static void main(String[] args) {
        String metin1 = "oynuyorum";
        String metin2 = new String("lol");
        int uzunluk = metin1.length();
        System.out.println("metin uzunluğu: " + uzunluk);
        char harf1 = metin1.charAt(0);
        System.out.println("baş harf: " + harf1);
        String altmetin = metin1.substring(3);
        System.out.println("alt metin: " + altmetin);
        int indeks = metin1.indexOf("r");
        System.out.println("'r' karakterinin indeksi: " + indeks);
        boolean iceriyormu = metin2.contains("lol");
        System.out.println("Metin 'lol' kelimesini içeriyor mu? " + iceriyormu);
        String yenimetin = metin1.replace("Merhaba", "Selam");
        System.out.println("yeni metin: " + yenimetin);
        String buyukHarfmetin = metin1.toUpperCase();
        System.out.println("nbüyük harfli metin: " + buyukHarfmetin);
        String kucukHarflimetin = metin2.toLowerCase();
        System.out.println("küçük harfli metin: " + kucukHarflimetin);
        String bosluklumetin = "    moşluklu metin    ";
        String bosluklarKaldirilmis = bosluklumetin.trim();
        System.out.println("boşluklar kaldırılmış metin: " + bosluklarKaldirilmis);
    }
}
