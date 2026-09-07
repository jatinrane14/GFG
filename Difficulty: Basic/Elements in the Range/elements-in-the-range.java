class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        int aCount = (end-start)+1;
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >=start && arr[i]<= end ){
                count++;
            }
        }
        return aCount==count;
    }
}