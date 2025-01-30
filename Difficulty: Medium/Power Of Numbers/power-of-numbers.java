//{ Driver Code Starts
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // test cases

        Solution ob = new Solution();

        while (T-- > 0) {
            int n = sc.nextInt(); // input N
            int ans = ob.reverseExponentiation(n);
            System.out.println(ans);
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int temp = n;
        if(n>10){
            return 0;
        }
        int ld,rev=0;
        while(n>0){
            ld = n%10;
            rev = (rev*10)+ld;
            n/=10;
        }
        int res = (int)Math.pow(temp,rev);
        return res;
    }
}
