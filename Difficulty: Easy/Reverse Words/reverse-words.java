class Solution {
    public String reverseWords(String s) {
        // Code 
        StringBuilder res = new StringBuilder();
        
        String[] arr = s.split("\\.");
        
        for(int i = arr.length-1;i>=0;i--){
            if (arr[i].isEmpty()) {
                continue;
            }
            if (res.length() > 0) {
                res.append(".");
            }
            res.append(arr[i]);
        }
        
        
        return res.toString();
    }
}
