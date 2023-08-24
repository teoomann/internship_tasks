package Variables;

public class EncapsulationOrnek {
    private final String ad;
    private final String soyad;

    public EncapsulationOrnek(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAdSoyad() {
        return ad + " " + soyad;
    }

    public static void main(String[] args) {
        EncapsulationOrnek ogrenci = new EncapsulationOrnek("teoman", "tunalı");
        System.out.println("Ad Soyad: " + ogrenci.getAdSoyad());
    }
}