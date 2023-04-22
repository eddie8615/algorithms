class Leetcode2390{
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '*')
                stack.push(s.charAt(i));
            else{
                stack.pop();
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result = stack.pop().toString() + result;
        }
        return result;
    }

    public String withoutStack(String s){
        int len = s.length();
        StringBuilder res = new StringBuilder();

        for(int i = 0, curr = 0; i < len; ++i){
            char c = s.charAt(i);
            if(c == '*')
                res.setLength(res.length() - 1);
            else res.append(c);
        }

        return res.toString();
    }
}