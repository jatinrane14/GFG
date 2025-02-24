//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static boolean prime(int n){
    //Write your code here
    //returns a boolean value
    if (n <= 1) {
        return false; 
    }
    // 1 and any number less than 1 are not prime
    for(int i = 2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            boolean ans = prime(n);
            if(ans)
            System.out.println("True");
            else
            System.out.println("False");
        
System.out.println("~");
}
        scn.close();
    }
}
// } Driver Code Ends