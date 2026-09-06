class Solution {
    public int reverseDigits(int n) {
        // Code here
        int temp = n;
        int rev =0;
        while(temp>0){
            int ld = temp%10;
            rev = rev*10 + ld;
            temp/=10;
        }
        return rev;
    }
}