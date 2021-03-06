package heaps;

public class MinHeap {
    int[] minHeap;
    int heapSize;
    int realSize = 0;

    public MinHeap(int heapSize){
        this.heapSize = heapSize;
        minHeap = new int [heapSize + 1];
        minHeap[0] = 0;
    }

    public void add(int element){
        realSize++;
        if(realSize > heapSize){
            System.out.println("Added too many elements");
            realSize--;
            return;
        }

        minHeap[realSize] = element;
        int index = realSize;
        int parent = index / 2;
        while(minHeap[index] < minHeap[parent] && index > 1){

//          Swap them
            int temp = minHeap[index];
            minHeap[index] = minHeap[parent];
            minHeap[parent] = temp;
            index = parent;
            parent = index / 2;

        }

    }

    public int peek(){
        return minHeap[1];
    }

    public int pop(){
        if(realSize < 1){
            System.out.println("Heap is already empty");
            return Integer.MAX_VALUE;
        }

        int removeElement = minHeap[1];
        minHeap[1] = minHeap[realSize];
        realSize--;
        int index = 1;
        while(index <= realSize / 2){
            int left = index * 2;
            int right = index * 2 + 1;
            if(minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]){
                if(minHeap[index] > minHeap[left]){
                    int temp = minHeap[index];
                    minHeap[index] = minHeap[left];
                    minHeap[left] = temp;
                    index = left;
                }else{
                    int temp = minHeap[index];
                    minHeap[index] = minHeap[right];
                    minHeap[right] = temp;
                    index = right;
                }
            }else
                break;
        }
        return removeElement;
    }

    @Override
    public String toString(){
        String str = "";
        for(int i = 1; i <= realSize; i++){
            str += String.valueOf(minHeap[i] + " ");
        }
        return str;
    }

    public static void main(String[] args){
        MinHeap minHeap = new MinHeap(5);
        minHeap.add(9);
        minHeap.add(5);
        minHeap.add(7);
        minHeap.add(1);
        minHeap.add(3);

        System.out.println(minHeap);
//      It prints 1 3 7 9 5 which is correct

        int removed = minHeap.pop();
        System.out.println(removed);
        System.out.println(minHeap);

    }
}