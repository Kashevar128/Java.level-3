import java.util.*;

public class ArrayMethod {

    public static int[] method1(int[] matrix) {
        System.out.println("Метод 1");
        System.out.println(Arrays.toString(matrix));
        int a = 4;
        int b = 0;

        for (int i = matrix.length - 1; i >= 0; i--) {
            if (a == matrix[i]) {
                b = i;
                break;
            }
        }
        List <Integer> arraylist = new ArrayList<Integer>();
        Integer[] integerMatrix = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            integerMatrix[i] = matrix[i];
        }
        for (int i = 0; i < integerMatrix.length; i++) {
            if (b == 0) throw new RuntimeException("В массиве отсутствует 4");
            if (i > b) {
                arraylist.add(integerMatrix[i]);
            }
        }
        Integer[] integerMatrix2 = new Integer[arraylist.size()];
        for (int i = 0; i < arraylist.size(); i++) {
            integerMatrix2[i] = arraylist.get(i);
        }
        int[] matrix2 = new int[integerMatrix2.length];
        for (int i = 0; i < integerMatrix2.length; i++) {
            matrix2[i] = integerMatrix2[i];
        }
        System.out.println(Arrays.toString(matrix2));
        return matrix2;
    }

    public static boolean method2(int[] arr) {
        System.out.println("Метод 2");
        System.out.println(Arrays.toString(arr));
        int a = 4;
        int b = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != a && arr[i] != b) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        int[] matrix = {1, 3, 6, 7, 4, 7, 8, 4, 8, 3, 1};
        method1(matrix);

        System.out.println();

        int[] arr = {1, 4, 1, 4, 5, 6, 1, 4};
        int[] arr2 = {1, 4, 1, 4, 4, 1, 1, 4};
        System.out.println(method2(arr));

    }
}

