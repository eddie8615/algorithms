package Sort;

import java.util.Random;

public class SelectionSort extends PracticeList{

    public SelectionSort(int size){
        super(size);
    }

    public void selectionSort(){
        for(int i = 0; i < arr.length - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args){
        SelectionSort sort = new SelectionSort(100);
        sort.print();
        sort.selectionSort();
        sort.print();
    }
}
