public class Leetcode345 {
    public String reverseVowels(String s) {        
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(isVowel(charArray[i]))
                stack.push(charArray[i]);
        }

        for(int i = 0; i < charArray.length; i++){
            if(isVowel(charArray[i]))
                charArray[i] = stack.pop();
        }
        return new String(charArray);
    }

    private boolean isVowel(char c){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'O', 'I', 'U'};
        for(char cha : vowels){
            if(cha == c)
                return true;
        }
        return false;
    }
}
