package Sort;

public class MergeSort extends PracticeList{
    public MergeSort(int size) {
        super(size);
    }

    public void mergeSort(int[] arr, int n){
        if(n < 2){
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for(int i = 0; i < mid; i++){
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            r[i - mid] = arr[i];
        }

        mergeSort(l, l.length);
        mergeSort(r, r.length);
        merge(arr, l, r, mid, n - mid);

    }

    public void merge(int[] arr, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while(i < left && j < right){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            }else{
                arr[k++] = r[j++];
            }
        }
        while(i < left){
            arr[k++] = l[i++];
        }

        while(j < right){
            arr[k++] = r[j++];
        }
    }

    public static void main(String[] args){
        MergeSort sort = new MergeSort(1000000);
        long start = System.currentTimeMillis();
        sort.mergeSort(sort.arr, sort.arr.length);
        long end = System.currentTimeMillis();
        double time = (end - start) ;
        System.out.println(time);
//        sort.print();
//        Time taken: 96141 ms
    }
}
