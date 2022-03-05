package Search;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    int[] list;
    static int answer;

    public BinarySearch(int size){
        list = new int[size];

        Random r = new Random();
        for(int i = 0; i < size; i++){
            list[i] = i;
        }
        Arrays.sort(list);
        int randomIndex = r.nextInt(size);

        answer = randomIndex;
    }

    public static void main(String[] args){
        BinarySearch bs = new BinarySearch(1000);
        System.out.println("Answer: " + answer);
        int index = bs.search();
        System.out.println(index);
    }

    public int search(){
        int numSearch = 0;
        int left = 0;
        int right = list.length - 1;
        int index = 0;
        while(left <= right){
            numSearch++;
            System.out.println(numSearch);

            index = left + ((right - left) / 2);
            if(list[index] == answer){
                return index;
            }
            if(list[index] < answer){
                left= index + 1;
            }
            else{
                right = index - 1;
            }

        }

        return index;
    }
}
