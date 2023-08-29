package Variables;

public class Ogrenci{
        private String ad;
        private String soyad;
        private String okulNo;
        private String sinif;
        private double not1;
        private double not2;
        private double not3;

        public Ogrenci(String ad, String soyad) {
            this.ad = ad;
            this.soyad = soyad;
        }

        public String getAd() {
            return ad;
        }

        public String getSoyad() {
            return soyad;
        }

        public String getOkulNo() {
            return okulNo;
        }

        public void setOkulNo(String okulNo) {
            this.okulNo = okulNo;
        }

        public String getSinif() {
            return sinif;
        }

        public void setSinif(String sinif) {
            this.sinif = sinif;
        }

        public double getNot1() {
            return not1;
        }

        public double getNot2() {
            return not2;
        }

        public double getNot3() {
            return not3;
        }

        public void setNot(double not) {
            setNot(not, 1);
        }
        public void setNot(double not1, double not2) {
            setNot(not1, not2, 0);
        }

        public void setNot(double not1, double not2, double not3) {
            this.not1 = not1;
            this.not2 = not2;
            this.not3 = not3;
        }

        public static void main(String[] args) {
            Ogrenci ogrenci = new Ogrenci("Teoman", "Tunalı");
            ogrenci.setOkulNo("12345");
            ogrenci.setSinif("10-F");
            ogrenci.setNot(85.5, 90.0, 78.5);

            System.out.println("Öğrenci Adı: " + ogrenci.getAd());
            System.out.println("Öğrenci Soyadı: " + ogrenci.getSoyad());
            System.out.println("Okul Numarası: " + ogrenci.getOkulNo());
            System.out.println("Sınıfı: " + ogrenci.getSinif());
            System.out.println("Not 1: " + ogrenci.getNot1());
            System.out.println("Not 2: " + ogrenci.getNot2());
            System.out.println("Not 3: " + ogrenci.getNot3());
        }
}

