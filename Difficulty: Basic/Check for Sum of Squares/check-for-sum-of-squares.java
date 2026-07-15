class Solution {
    public boolean checkSquares(int n) {
        // code here
        long a = 0;
        long b = (long)Math.sqrt(n);
        while(a<=b){
            long sum = a*a+b*b;
            if(sum == n){
                return true;
            }else if(sum<n){
                a++;
            }else{
                b--;
            }
        }
        return false;
    }
}