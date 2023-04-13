package Sort;

public class BubbleSort extends PracticeList{
    public BubbleSort(int size) {
        super(size);
    }

    public void bubbleSort(){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void recursiveBubbleSort(int[] arr, int n){
        if(n == 1)
            return;

        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, n-1);
    }

    public static void main(String[] args){
        BubbleSort sort = new BubbleSort(100000);
//        sort.print();

        /**
         * Recursive version suffers stack overflow when the list has more than 100000 entries
         */
//        sort.recursiveBubbleSort(sort.arr, sort.arr.length);

        long start = System.currentTimeMillis();
        sort.bubbleSort();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        Time taken: takes too much time, cannot measure it
    }
}
