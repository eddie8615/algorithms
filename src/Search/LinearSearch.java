package Search;

import java.util.Random;

public class LinearSearch {
    int[] list;
    static int answer;

    public LinearSearch(int size){
        list = new int[size];

//        populate entries using random
        Random random = new Random();
        for(int i = 0; i < size; i++){
            list[i] = random.nextInt(1000);
        }
        answer = random.nextInt(1000);
    }

    public static void main(String[] args){
        LinearSearch ls = new LinearSearch(1000);
        int index = ls.search();
        if(index == Integer.MIN_VALUE)
            System.out.println("Cannot find the element");
        else
            System.out.println("This element is in the index of " + index);
    }

    public int search(){
        for(int i = 0;i < list.length; i++){
            if(list[i] == answer)
                return i;
        }
        return Integer.MIN_VALUE;
    }
}
