// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        Arrays.sort(arr);
        long result = 0;
        int MOD = 1000000007;
        for(int i =0;i<arr.length;i++){
            result =(result + (long)arr[i]*i)%MOD;
        }
        return (int)result;
    }
}
