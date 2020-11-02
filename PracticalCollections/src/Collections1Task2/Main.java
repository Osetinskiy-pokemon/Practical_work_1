package Collections1Task2;
import java.util.*;
/*
2) Реализовать метод, который добавляет 1000000 случайных элементов в ArrayList и
LinkedList. Реализовать второй метод, который выбирает из списка элемент наугад 100000
раз. Замерьте время и скажите кто быстрее.
 */
public class Main {
    public static void main(String[] strings){
        compareLists();
    }

    public static void compareLists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int K = 100000;
        for (int i = 0; i < N; i++) { //заполняем наши массивы
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < K; i++) { //это быстрее
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (int i = 0; i < K; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}