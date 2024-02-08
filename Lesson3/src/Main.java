import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        // Задача 2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));

        // Задача 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        // Задача 4
        int size = 5;
        int[][] arr4 = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr4[i][i] = 1;
            arr4[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(arr4[i]));
        }

        // Задача 5
        int len = 10;
        int initialvalue = 5;
        int[] arr5 = createArray(len, initialvalue);
        System.out.println(Arrays.toString(arr5));

        // Задача 6
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = findMin(arr6);
        int max = findMax(arr6);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

    public static int[] createArray(int len, int initialvalue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialvalue);
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}