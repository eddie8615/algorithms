public class Leetcode278 {
    public int firstBadVersion(int n){
        int first = 1;
        
        while(first < n){
            int mid = first + (n - first) / 2;
            if(isBadVersion(mid)){
                n = mid - 1;
            }else
                first = mid + 1;
        }

        if(isBadVersion(n))
            return n;
        else
            return n + 1;
    }

    private boolean isBadVersion(int n){
        return true;
    }
}
