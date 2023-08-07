package Variables;

public class math_kutuphane {
    public static void main(String[] args) {
        double mutlakdeger = Math.abs(-5.7);
        System.out.println("mutlak değer: " + mutlakdeger);

        double usteldeger = Math.exp(2.0);
        System.out.println("üstel: " + usteldeger);

        double karekok = Math.sqrt(25.0);
        System.out.println("karekök: " + karekok);

        double yuvarlamaasagi = Math.floor(7.8);
        System.out.println("aşağı yuvarlama: " + yuvarlamaasagi);

        double yuvarlamayukari = Math.ceil(3.2);
        System.out.println("yukarı yuvarlama: " + yuvarlamayukari);
        double rastgelesayi = Math.random();
        System.out.println("rastgele sayı: " + rastgelesayi);
        int maximumdeger = Math.max(10, 25);
        System.out.println("max değer: " + maximumdeger);
        int minimumdeger = Math.min(5, 15);
        System.out.println("minimum değer: " + minimumdeger);
    }
}

