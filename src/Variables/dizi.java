package Variables;
import java.util.ArrayList;
public class dizi {
    public static void main(String[] args) {

        int[] arrayX = new int[10];
        int[] arrayY = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayX[i] = getRandomNumber(20);
            arrayY[i] = getRandomNumber(20);
        }


        System.out.println("X Dizisi: " + arrayToString(arrayX));
        System.out.println("Y Dizisi: " + arrayToString(arrayY));

        ArrayList<Integer> xNotInY = getElementsNotInArray(arrayX, arrayY);

        ArrayList<Integer> yNotInX = getElementsNotInArray(arrayY, arrayX);

        ArrayList<Integer> commonElements = getCommonElements(arrayX, arrayY);

        System.out.println("X dizisinde Y dizisinde olmayan elemanlar: " + xNotInY);
        System.out.println("Y dizisinde X dizisinde olmayan elemanlar: " + yNotInX);
        System.out.println("X ve Y dizilerinde ortak olan elemanlar: " + commonElements);
    }

    static int getRandomNumber(int max) {
        return (int) (Math.random() * max);
    }

    static boolean contains(int[] array, int num) {
        for (int n : array) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    static ArrayList<Integer> getElementsNotInArray(int[] array, int[] otherArray) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (!contains(otherArray, num)) {
                result.add(num);
            }
        }
        return result;
    }
    static ArrayList<Integer> getCommonElements(int[] arrayX, int[] arrayY) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int num : arrayX) {
            if (contains(arrayY, num) && !commonElements.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }

    static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}