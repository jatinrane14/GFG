// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        String res = ""+s.charAt(0);
        for(int j =1;j<s.length();j++){
            char ch = s.charAt(j);
            if(!res.contains(String.valueOf(ch))){
                res+=ch;
            }
        }
        return res;
    }
}