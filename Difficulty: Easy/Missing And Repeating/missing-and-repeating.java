class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n =arr.length;
        int[] freq = new int[n+1];

        long imgSum =0;
        for(int i =0;i<=n-1;i++){
            imgSum+=arr[i];
            freq[arr[i]]++;
        }
        int repeat = 0;
        for(int i =0;i<freq.length;i++){
            if(freq[i]>1){
                repeat = i;
                break;
            }
        }
        
        long expectedSum = (long) n*(n+1)/2;
        
        int missing = (int)(repeat - (imgSum - expectedSum));
        res.add(repeat);
        res.add(missing);
        return res;
    }
}
