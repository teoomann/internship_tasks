package Variables;

public class lastindexof_ornek {
    public static void main(String[] args) {
        int[] numbers = { 2, 5, 8, 3, 2, 10, 7, 2 };
        int searchValue = 2;
        int lastIndex = getLastIndexOf(numbers, searchValue);
        System.out.println("Aranan değer: " + searchValue);
        if (lastIndex != -1) {
            System.out.println("Son indeks: " + lastIndex);
        } else {
            System.out.println("Aranan değer çar içinde bulunamadı.");
        }
    }
    public static int getLastIndexOf(int[] arr, int searchValue) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
