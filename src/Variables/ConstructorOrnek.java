package Variables;

public class ConstructorOrnek {

    private String ad;
    private String soyad;
    private String kimlikNumarasi;

    public ConstructorOrnek() {
    }

    public ConstructorOrnek(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public ConstructorOrnek(String ad, String soyad, String kimlikNumarasi) {
        this(ad,soyad);
        this.kimlikNumarasi = kimlikNumarasi;
    }


    public ConstructorOrnek withName(String ad){
        this.ad = ad;
        return this;
    }

    public ConstructorOrnek withSurname(String soyad){
        this.soyad = soyad;
        return this;
    }


    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public static void main(String[] args) {
        ConstructorOrnek ornek1 = new ConstructorOrnek("John", "Doe", "123456");
        ConstructorOrnek ornek2 = new ConstructorOrnek("Jane", "Smith");

        for(int i = 0; i<5;i++){
            int j = 5;
            System.out.println(i+j);
        }
        int j=1;
        System.out.println(j);
        System.out.println("Örnek 1: " + ornek1.getAd() + " " + ornek1.getSoyad() + ", Kimlik Numarası: " + ornek1.getKimlikNumarasi());
        System.out.println("Örnek 2: " + ornek2.getAd() + " " + ornek2.getSoyad() + ", Kimlik Numarası: " + ornek2.getKimlikNumarasi());
    }

    @Override
    public String toString() {
        return "{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", kimlikNumarasi='" + kimlikNumarasi + '\'' +
                '}';
    }
}

