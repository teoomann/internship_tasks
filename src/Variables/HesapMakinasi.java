package Variables;

public class HesapMakinasi {

    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }


    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public double bol(int sayi1, int sayi2) {
        if (sayi2 != 0) {
            return (double) sayi1 / sayi2;
        } else {
            throw new ArithmeticException("Sıfıra bölme hatası");
        }
    }

    public int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public int carp(int sayi1, int sayi2, int sayi3) {
        return sayi1 * sayi2 * sayi3;
    }

    public int cikar(int sayi1, int sayi2, int sayi3) {
        return sayi1 - sayi2 - sayi3;
    }

    public double bol(int sayi1, int sayi2, int sayi3) {
        if (sayi2 != 0 && sayi3 != 0) {
            return (double) sayi1 / (sayi2 * sayi3);
        } else {
            throw new ArithmeticException("Sıfıra bölme hatası");
        }
    }

    public static void main(String[] args) {
        HesapMakinasi hesapMakinasi = new HesapMakinasi();
        System.out.println("Toplam: " + hesapMakinasi.topla(5, 3));
        System.out.println("Çarpım: " + hesapMakinasi.carp(5, 3));
        System.out.println("Çıkarma: " + hesapMakinasi.cikar(5, 3));
        System.out.println("Bölme: " + hesapMakinasi.bol(5, 3));


        System.out.println("Toplam: " + hesapMakinasi.topla(5, 3, 2));
        System.out.println("Çarpım: " + hesapMakinasi.carp(5, 3, 2));
        System.out.println("Çıkarma: " + hesapMakinasi.cikar(5, 3, 2));
        System.out.println("Bölme: " + hesapMakinasi.bol(5, 3, 2));
    }
}
