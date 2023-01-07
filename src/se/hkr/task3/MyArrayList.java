package se.hkr.task3;
import java.util.Arrays;


public class MyArrayList<T> {
    T Object;
    T[] MyArray;
    private int index = 0;
    private int indexSeries = 0;

    @SuppressWarnings("unchecked")
    public MyArrayList(){ MyArray = (T[]) new Object[10];
    }

    public void add(T Object){
        if(index == 10){
            index = 0;
            indexSeries++;
            MyArray = Arrays.copyOf(MyArray, index + 10);
            MyArray[index] = Object;
        }else{
            MyArray[index] = Object;
            index++;
        }
    }

    public T get(){
        return x;
    }
}
