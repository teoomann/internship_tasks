package Variables;public class constructor_ornek {

        private String ad;
        private String soyad;
        private String kimlikNumarasi;

        public constructor_ornek(String ad, String soyad, String kimlikNumarasi) {
            this.ad = ad;
            this.soyad = soyad;
            this.kimlikNumarasi = kimlikNumarasi;
        }

        public constructor_ornek(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
            this.kimlikNumarasi = null;
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
            constructor_ornek ornek1 = new constructor_ornek("John", "Doe", "123456");
            constructor_ornek ornek2 = new constructor_ornek("Jane", "Smith");

            System.out.println("Örnek 1: " + ornek1.getAd() + " " + ornek1.getSoyad() + ", Kimlik Numarası: " + ornek1.getKimlikNumarasi());
            System.out.println("Örnek 2: " + ornek2.getAd() + " " + ornek2.getSoyad() + ", Kimlik Numarası: " + ornek2.getKimlikNumarasi());
        }
    }

