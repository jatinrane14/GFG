class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int left =0;
        int right = n-1;
        for(int i =0;i<n/2;i++){
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}