// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int countGreator =0;
        int countLesser =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                countLesser++;
            }
            if(arr[i]>=target){
                countGreator++;
            }
        }
        return new int[]{countLesser,countGreator};
    }
}