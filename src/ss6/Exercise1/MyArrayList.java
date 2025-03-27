package ss6.Exercise1;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    private int[] arr;
    private int size;
    private int[] emtyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emtyArray;
    }

    public MyArrayList(int capacity, int[] arr) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public void add(int element) {
        if (arr == emtyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }

        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) { // Tránh trường hợp bằng 0 hoặc 1
                capacity++;
            }

            // Tạo một mảng mới có kích thước là capacity
            int[] brr = new int[this.capacity];

            // copy phan tu
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }

            arr = brr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++){
            stringBuilder.append(arr[i]).append("\t");
        }
        return stringBuilder.toString();
    }
}
