package com.company;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> da = new DynamicArray<>();
        for (int i = 0; i < 20; i++ ) {
            da.add(i);
        }
        da.add(90);
        da.add(100);
        da.remove(5);
        for (int i = 0; i < da.size(); i++) {
            System.out.print(da.get(i) + " ");
        }
	}
}
