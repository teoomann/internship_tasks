package Variables;

public class metot_ornek {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSurname("tunali");

        System.out.println(s1.getSurname());



        double sayi1 = 10;
        double sayi2 = 5;

        double toplamSonuc = toplama(sayi1, sayi2);
        System.out.println("toplama: " + toplamSonuc);

        double cikarmaSonuc = cikarma(sayi1, sayi2);
        System.out.println("çıkarma: " + cikarmaSonuc);

        double carpmaSonuc = carpma(sayi1, sayi2);
        System.out.println("çarpma: " + carpmaSonuc);

        double bolmeSonuc = bolme(sayi1, sayi2);
        System.out.println("bölme: " + bolmeSonuc);
    }

    public static double toplama(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    public static double bolme(double sayi1, double sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            System.out.println("sıfıra bölemezsin");
            return Double.NaN;
        }
    }
}

