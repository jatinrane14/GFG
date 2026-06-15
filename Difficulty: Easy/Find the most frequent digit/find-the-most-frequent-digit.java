// User function Template for Java
class Solution {
    String solve(String N) {
        // code here
        long[] hashArr = new long[10];
        // long n = Long.parseLong(N);
        // while(n>0){
        //     long ld = n%10;
        //     n/=10;
        //     hashArr[ld]++;
        // }
        for (char ch : N.toCharArray()) {
            int digit = ch - '0';
            hashArr[digit]++;
        }
        long mostOccurance = Long.MIN_VALUE;
        for(int i =0;i<hashArr.length;i++){
            if(hashArr[i] > mostOccurance){
                mostOccurance = hashArr[i];
            }
        }
        
        StringBuilder str = new StringBuilder();
        long ans = -1;
        for(int i =0;i<hashArr.length;i++){
            if(hashArr[i] == mostOccurance){
                ans = Math.max(ans,i);
            }
        }
        str.append(ans);
        
        return str.toString();
    }
}