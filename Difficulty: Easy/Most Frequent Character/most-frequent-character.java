class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> obj = new HashMap<>();
        for(int i=0;i<s.length();i++){
            obj.put(s.charAt(i),obj.getOrDefault(s.charAt(i),0)+1);
        }
        char highChar = 'm';
        int high =0;
        for(Character key : obj.keySet()){
            if(obj.get(key) > high){
                highChar = key;
                high = obj.get(key);
            }else if(obj.get(key) == high){
                if(key < highChar){
                    highChar = key;
                }
            }
        }
        
        return highChar;
    }
}