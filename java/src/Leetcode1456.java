public class Leetcode1456 {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int max = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(arr[i]))
                max++;
        }
        int curr = max;
        for(int i = k; i < arr.length; i++){
            // System.out.println(curr);
            if(isVowel(arr[i - k]))
                curr--;
            if(isVowel(arr[i]))
                curr++;
            max = Math.max(max, curr);
        }
        return max;
    }

    private boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char ch : vowels){
            if(ch == c)
                return true;
        }
        return false;
    }
}
