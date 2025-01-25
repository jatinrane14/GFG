//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int temp =n,count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        temp = n;
        int sum=0,ld;
        while(temp>0){
            ld = temp%10;
            sum+=Math.pow(ld,count);
            temp/=10;
        }
        if(sum == n){
            return true;
        }
        return false;
    }
}