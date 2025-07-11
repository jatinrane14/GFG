// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int mid = arr.size()/2;
        int leftHalf = 0;
        int rightHalf = 0;
        for(int i =0;i<arr.size();i++){
            if(i<mid){
                leftHalf+=arr.get(i);
            }
            if(i>=mid){
                rightHalf+=arr.get(i);
            }
        }
        if(leftHalf>rightHalf){
            return (leftHalf-rightHalf);
        }
        return rightHalf- leftHalf;
    }   
}