class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // write code
        long[] hashArr = new long[1000000];
        
        for(int elem : arr){
            hashArr[elem]++;
            if(hashArr[elem]==k){
                return elem;
            }
        }
        
        return -1;
    }
}