package RecursionTask2;
import java.util.Arrays;

//2) Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//Используйте перебор и двоичный поиск для решения этой задачи. Сравните время
//выполнения обоих решений для больших массивов (например, 100000000 элементов).

public class Main{
    public static int enumeration(double[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public static int binarySearch(double[] sortedArr, double value) {
        return binarySearch(sortedArr, value, 0, sortedArr.length);
    }

    private static int binarySearch(double[] sortedArr, double value, int low, int high) {
        int middle = (low + high) / 2;
        if (high < low) { return -1;}
        if (value == sortedArr[middle]) { // если нашёлся
            return middle;
        } else if (value < sortedArr[middle]) { // ищем в левой половине
            return binarySearch(
                    sortedArr, value, low, middle - 1);
        } else {
            return binarySearch( // ищем в правой половине
                    sortedArr, value, middle + 1, high);
        }
    }

    private static double[] generateArr(int length) {
        double[] arr = new double[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] arr = generateArr(100000000);
        Arrays.sort(arr);

        long time = System.currentTimeMillis();
        System.out.println(enumeration(arr, 0.3));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(binarySearch(arr, 0.3));
        System.out.println(System.currentTimeMillis() - time);
    }
}
