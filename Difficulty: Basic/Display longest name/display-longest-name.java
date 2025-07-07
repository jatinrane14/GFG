
class Solution {
    public String longest(List<String> arr) {
        // code here
        String longestName="";
        
        for(int i =0; i<arr.size();i++){
            if(longestName.length()<arr.get(i).length()){
                longestName=arr.get(i);
            }
        }
        return longestName;
    }
}
