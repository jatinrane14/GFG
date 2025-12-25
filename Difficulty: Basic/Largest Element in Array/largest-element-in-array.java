class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        int lar = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i] > lar){
                lar = arr[i];
            }
        }
        return lar;
    }
}
