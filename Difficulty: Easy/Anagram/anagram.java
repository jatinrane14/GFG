class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here4
        if(s1.length() != s2.length()){
            return false;
        }
        int[] hash1 = new int[123];
        int[] hash2 = new int[123];
        
        for(int i =0; i<s1.length();i++){
            hash1[s1.charAt(i)]++;
            hash2[s2.charAt(i)]++;
        }
        
        for(int i =97;i<hash1.length;i++){
            if(hash1[i] != hash2[i]){
                return false;
            }
        }
        
        return true;
    }
}