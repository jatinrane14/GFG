class Solution {
    String isGoodString(String s) {
        // code here
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return "NO";
            }
        }
        return "YES";
    }
}