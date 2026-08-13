class Solution {
    private static void swap(int a,int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void swapElements(int[] arr) {
        // Code here
        for(int i =0;i<arr.length-2;i++){
            swap(i,i+2,arr);
        }
    }
}