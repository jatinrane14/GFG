class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.equals(s2) || (s1.length()==1 && s2.length()==1) || s1.length()!=s2.length()){
            return false;
        }
        if((s1.length()==1 && s2.length()==1) && !s1.equals(s2)){
            return false;
        }
        String comb1 = s1.substring(s1.length()-2 , s1.length())+s1.substring(0,s1.length()-2);
        String comb2 = s1.substring(2,s1.length()) + s1.substring(0,2);
        return (comb1.contains(s2) || comb2.contains(s2));
        
    }
}