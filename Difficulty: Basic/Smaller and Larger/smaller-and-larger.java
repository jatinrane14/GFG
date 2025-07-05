// User function Template for Java

class Solution {
        int resultArr[]= {0,0};
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                resultArr[0]+=1;
            }
            if(arr[i]>=target){
                resultArr[1]+=1;
            }
        }
        return resultArr;
    }
}