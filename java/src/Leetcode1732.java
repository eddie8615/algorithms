public class Leetcode1732 {
    public int largestAltitude(int[] gain) {
        int largest = 0;
        int curr = largest;
        for(int p : gain){
            curr += p;
            largest = Math.max(largest, curr);
        }
        return largest;
    }
}
