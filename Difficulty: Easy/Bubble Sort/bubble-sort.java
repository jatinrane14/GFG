class Solution {
    public static void swap(int arr[],int a,int aNext){
        int temp = arr[a];
        arr[a] = arr[aNext];
        arr[aNext] = temp;
    }
    public void bubbleSort(int[] arr) {
        // code here
        for(int i = arr.length -1; i>=0;i--){
            for(int j =0; j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
}