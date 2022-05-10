package main.library.search;

import main.library.sort.BubbleSort;

public class BinarySearch {
    private final int searched;
    private final int[] data;
    public BinarySearch(int[] data,int searched){
        this.data = new BubbleSort(data).get();
        this.searched = searched;
    }

    public int search(){
        double min = 0;
        double max = data.length-1;
        int index = (int) Math.round((max-min)/2);

        while (index != 0){
            index = (int) Math.round((max-min)/2);
            if (data[(int)min+index] == searched) return (int)min+index;

            else if (data[(int)min+index] < searched){
                min += index;
            }
            else {
                max -= index;
            }
        }
        return -1;
    }
}