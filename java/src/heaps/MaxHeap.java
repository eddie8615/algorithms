package heaps;

public class MaxHeap {
    int[] maxHeap;

    int realSize = 0;
    int heapSize;

    public MaxHeap(int heapSize){
        this.heapSize = heapSize;

        maxHeap = new int[heapSize + 1];
        maxHeap[0] = 0;
    }

    public void add(int element){
        realSize++;
        if(realSize > heapSize)
            return;

        int index = realSize;
        maxHeap[index] = element;
        int parent = index / 2;

        while(maxHeap[index] > maxHeap[parent] && index > 1){

            int temp = maxHeap[parent];
            maxHeap[parent] = maxHeap[index];
            maxHeap[index] = temp;
            index = parent;
            parent = index / 2;

        }
    }

    public int peek(){
        return maxHeap[1];
    }

    public int pop(){
        int removeElement = maxHeap[1];
        maxHeap[1] = maxHeap[realSize];
        realSize--;
        int index = 1;
        int left = index * 2;
        int right = index * 2 + 1;

        while(index <= realSize / 2){
            if(maxHeap[left] > maxHeap[index] || maxHeap[right] > maxHeap[index]){
                if(maxHeap[left] > maxHeap[index]){
                    int temp = maxHeap[left];
                    maxHeap[left] = maxHeap[index];
                    maxHeap[index] = temp;
                    index = left;
                }
                else{
                    int temp = maxHeap[right];
                    maxHeap[right] = maxHeap[index];
                    maxHeap[index] = temp;
                    index = right;
                }
            }else
                break;

        }
        return removeElement;

    }

    public int size(){
        return realSize;
    }

    public String toString(){
        String str = "";
        for(int i = 1; i <= realSize; i++){
            str += String.valueOf(maxHeap[i]) + " ";
        }
        return str;
    }

    public static void main(String[] args){
        MaxHeap heap = new MaxHeap(5);

        heap.add(10);
        heap.add(9);
        heap.add(11);
        heap.add(12);
        heap.add(8);

        System.out.println(heap);
    }
}
