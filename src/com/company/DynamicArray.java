package com.company;
import java.util.Arrays;

public class DynamicArray <T> {
    private T[] t;
    private int arr = 20;
    private int sizeArr = 0;

    public DynamicArray() {
        t = (T[]) new Object[arr] ;
    }
    public void add(T el) {
        if (sizeArr == t.length) {
            t = Arrays.copyOf(t, t.length * 2);//метод копирования(переноса) массива в больший массив
        }
        t[sizeArr] = el;
        sizeArr++;
    }

    public void remove(int index) {
        System.arraycopy(t, (index + 1), t, index, (sizeArr - index - 1));
        sizeArr--;
        t[sizeArr] = null;
    }

    public T get(int index) {
        return t[index];
    }

    public int size() {
        return sizeArr;
    }
}
