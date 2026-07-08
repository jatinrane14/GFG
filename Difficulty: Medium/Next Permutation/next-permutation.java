class Solution {
    void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int breakpoint =-1;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1){
            int low = 0;
            int high = n-1;
            while(low<=high){
                swap(arr,low,high);
                low++;
                high--;
            }
            return;
        }
        
        for(int i =n-1;i>breakpoint;i--){
            if(arr[breakpoint] < arr[i]){
                swap(arr, breakpoint,i);
                break;
            }
        }
        
        // reverse
        int low = breakpoint+1;
        int high = n-1;
        while(low<=high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
}