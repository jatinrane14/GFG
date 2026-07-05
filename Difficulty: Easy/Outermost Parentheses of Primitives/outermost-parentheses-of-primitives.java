class Solution {
    public String removeOuter(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        int open =0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                open++;
                if(open>1){
                    result.append(c);
                }
            }else if(c==')'){
                open--;
                if(open>0){
                    result.append(c);
                }
            }
        }
        
        return result.toString();
    }
}