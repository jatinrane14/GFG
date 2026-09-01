class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> st = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(st.contains(ch)){
                return Character.toString(ch);
            }
            st.add(ch);
        }
        return "-1";
    }
}