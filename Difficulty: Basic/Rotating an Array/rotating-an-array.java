// User function Template for Java

class Solution {
    void leftRotate(int arr[], int d) {
        // code here
        int n = arr.length;
        
        int temp[] = new int[d];
        for(int i =0;i<d;i++){
            temp[i] = arr[i];
        }
        
        for(int i = d;i<n;i++){
            arr[i-d] = arr[i];
        }
        
        int j =0;
        for(int i = n-d;i<n;i++){
            arr[i] = temp[j++];   
        }
    
    }
}
