package Sort;

import java.util.Random;

public abstract class PracticeList{
    protected int[] arr;


    public PracticeList(int size){
        arr = new int[size];
        init(size);

    }
    protected void init(int size){
        Random r = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = r.nextInt(size);
        }
    }

    protected void print(){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
