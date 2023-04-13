package Sort;

public class InsertionSort extends PracticeList{
    public InsertionSort(int size) {
        super(size);
    }

    public void insertionSort(){
        for(int i = 1; i < arr.length; i++){
            int element = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > element){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = element;
        }
    }

    public static void main(String[] args){
        InsertionSort sort = new InsertionSort(1000000);
        long start = System.currentTimeMillis();
        sort.insertionSort();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        sort.print();
    }
}
