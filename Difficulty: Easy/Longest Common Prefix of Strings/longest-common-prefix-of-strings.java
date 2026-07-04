class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        int minLength = Integer.MAX_VALUE;
        int index = 0;
        int len=0;
        for(int i =0;i<arr.length;i++){
            len = arr[i].length();
            if(minLength > len){
                minLength = len;
                index = i;
            }
        }
        String minStr = arr[index];
        for(int i =0;i<minStr.length();i++){
            char ch = minStr.charAt(i);
            for(int j =0;j<arr.length; j++){
                if(arr[j].charAt(i) != ch){
                    return minStr.substring(0, i); // Returns the matching part so far
                }
            }
        }
        
        return minStr;
        
    }
}