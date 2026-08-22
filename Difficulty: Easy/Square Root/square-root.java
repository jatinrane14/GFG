class Solution {
    int floorSqrt(int n) {
        // code here
        int low =0;
        int high = n;
        int mid = -1;
        while(low<=high){
            mid = low + (high-low)/2;
            
            if((long)mid*mid > (long)n){
                high = mid-1;
            }else if((long)mid*mid == n){
                return mid;
            }else{
                low = mid+1;
            }
        }
        return Math.round(high);
    }
}