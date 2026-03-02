class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        for(Integer elem : arr){
            if(elem == target){
                count++;
            }
        }
        return count;
    }
}
