public class Leetcode374 {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while(l <= r){
            int mid = (l - r) / 2 + r;
            if(guess(mid) == -1){
                r = mid - 1;
            }else if(guess(mid) == 1){
                l = mid + 1;
            }else{
                return mid;
            }
        }
        return 0;
    }
}
