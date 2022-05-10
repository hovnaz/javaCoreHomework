package main.library.sort;

public class BubbleSort {
    private final int[] data;

    public BubbleSort(int[] data) {
        // initialization data
        this.data = data;
        sort();
    }

    public int[] get() {
        return data;
    }

    private void sort() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                int next = data[j+1];
                if (next < data[j]){
                    int tmp = data[j];
                    data[j] = next;
                    data[j+1] = tmp;
                }
            }
        }
    }
}
