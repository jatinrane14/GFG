class Solution {
    public static String countSort(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        char[] hashChar = new char[122+1];
        for(int i =0;i<s.length();i++){
            hashChar[s.charAt(i)]++;
        }
        
        for(int i =97;i<hashChar.length;i++){
            while(hashChar[i] != 0){
                res.append((char)i);
                hashChar[i]--;
            }
        }
        
        return res.toString();
        
    }
}