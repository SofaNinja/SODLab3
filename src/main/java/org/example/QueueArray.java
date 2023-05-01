package org.example;

import java.util.Arrays;

public class QueueArray {

    private int[] data = new int[30];
    private int size = 0;
    private Comparator comparator = new Comparator();

    public QueueArray() { }

    public void add(int value) {
        ensureCapacity(size+1);
        data[size++] = value;
        sort();
    }

    public int remove() {
        int result = data[0];
        data[0] = data[size - 1];
        sort();
        return result;
    }

    void heap(int[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && comparator.compare(arr[left],arr[largest]) > 0)
            largest = left;
        if (right < size && comparator.compare(arr[right], arr[largest]) > 0)
            largest = right;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heap(arr, size, largest);
        }
    }

    public void sort() {
        int n = size;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heap(data, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = data[0];
            data[0] = data[i];
            data[i] = temp;
            heap(data, i, 0);
        }
    }

    private void ensureCapacity(int size){
        if (data.length < size){
            data = Arrays.copyOf(data, data.length + 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}