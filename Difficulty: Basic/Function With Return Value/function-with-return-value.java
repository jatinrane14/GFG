//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
// User function Template for Java

// Write the complete function returnValueFunction below
// This function should take n as a parameter
// return double of n
// code here
public static int returnValueFunction(int n){
    return n+n;
}

//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            System.out.println(returnValueFunction(n));

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends