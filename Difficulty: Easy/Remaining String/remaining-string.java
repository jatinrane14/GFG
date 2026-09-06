class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        if(s.equals("")){
            return "";
        }
        int occuranceCount = 0;
        int idx = -1;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == ch){
                occuranceCount++;
            }
            if(occuranceCount == count){
                idx = i;
                break;
            }
        }
        if(idx == -1 || idx == s.length()-1){
            return "";
        }
        return s.substring(idx+1,s.length());
    }
}