package Collections2Task1;
import java.util.*;

class ArraysIt<T> implements Iterable<T>{
    private T[][] arr;

    public ArraysIt(T[][] array) {
        this.arr = arr;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int i, j;

            @Override
            public boolean hasNext() {
                for(int i = this.i; i< arr.length; i++){
                    for(int j = this.j; j< arr[i].length; j++){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public T next() {
                if(!hasNext())
                    throw new NoSuchElementException();
                T arr2 = arr[i][j];
                j++;
                for(int i = this.i; i< arr.length; i++){
                    for(int j = (i == this.i ? this.j : 0); j< arr[i].length; j++){
                        this.i = i;
                        this.j = j;
                        return arr2;
                    }
                }return arr2; }
        };
    }
}