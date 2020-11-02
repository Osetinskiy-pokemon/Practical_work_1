package Collections2Task1;
import java.util.*;

/*
Реализуйте итератор по двумерному массиву
 */
public class Main {
    public static void main(String[] args) {
        Double[][] arr = new Double[2][3];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = Math.random();
            }
        }
        ArraysIt arraysIt = new ArraysIt(arr);
        System.out.println(arraysIt.iterator());
    }
}
