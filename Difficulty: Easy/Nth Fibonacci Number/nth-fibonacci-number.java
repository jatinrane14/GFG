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

            System.out.println(ob.nthFibonacci(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        // code here
        int a =0;
        int b =1;
        int c = a+b;
        for(int i =3;i<=n;i++){
            a = b;
            b = c;
            c = a+b;
        }
        return c;
    }
}