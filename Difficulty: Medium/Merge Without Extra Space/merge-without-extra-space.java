class Solution {
    private void swap(int a[], int b[],int ind1, int ind2){
        if(a[ind1] > b[ind2]){
            int temp = a[ind1];
            a[ind1]  = b[ind2];
            b[ind2] = temp;
        }
    }
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int len = n+m;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int left = 0;
            int right= left+gap;
            while(right < len){
                // arr1 and arr2
                if(left<n && right>=n){
                    swap(a,b,left,right-n);
                }
                // arr2 and arr2
                else if(left>=n){
                    swap(b,b,left-n,right-n);
                }else{
                    swap(a,a,left,right);
                }
                left++;right++;
            }
            if(gap ==1 ) break;
            gap = (gap/2)+ (gap%2);
        }
    }
}
