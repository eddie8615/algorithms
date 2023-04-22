class Leetcode1768{
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()){
            if(i == j){
                merged.append(word1.charAt(i++));                                
            }else{
                merged.append(word2.charAt(j++));
            }
        }

        while(i < word1.length()){
            merged.append(word1.charAt(i++));
        }
        while(j < word2.length()){
            merged.append(word2.charAt(j++));
        }

        return merged.toString();
    }
}