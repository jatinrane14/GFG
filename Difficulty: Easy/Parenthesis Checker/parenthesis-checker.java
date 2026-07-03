class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char stElem = st.pop();
                if((c == ']' && stElem != '[') || 
                    (c == ')' && stElem != '(') ||
                    (c == '}' && stElem != '{')){
                    return false;
                }
            }
            
            i++;
        }
        
        return st.isEmpty();
    }
}
