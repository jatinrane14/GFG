class Solution {
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
    public void sort012(int[] arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
        
    }
}