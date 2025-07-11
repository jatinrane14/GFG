class Solution {
    int convertfive(int num) {
        // Your code here
        if(num==0){
            return 5;
        }
        int rev = 0;
        while (num > 0) {
            int ld = num % 10;
            if (ld == 0) {
                rev = rev * 10 + 5;
            } else {
                rev=rev*10+ld;
            }
            num/=10;
        }
        num =0;
        while (rev > 0) {
            int ld=rev%10;
            num=num*10+ld;
            rev/=10;
        }
        return num;
    }
}