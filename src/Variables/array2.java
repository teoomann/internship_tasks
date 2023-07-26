package Variables;

public class array2 {
    public static void main (String[] args) {

        String lolcarlistesi = "yone,mordekaiser,nasus,kayle,trundle";

        String[] Array =lolcarlistesi.split(",");
        System.out.println(" array dizi uzunluğu =" +Array.length);
        for (String lolcari : Array) {
            System.out.println(lolcari);
        }








}
}
