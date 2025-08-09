class Solution {
    public boolean isPerfect(int[] arr) {
        // code here
        int i =0;
        while(i+1<arr.length && arr[i+1]> arr[i]){
            i++;
        }
        while(i+1<arr.length && arr[i] == arr[i+1]){
            i++;
        }
        while(i+1<arr.length && arr[i]>arr[i+1]){
            i++;
        }
        return i == arr.length-1;
    }
}
