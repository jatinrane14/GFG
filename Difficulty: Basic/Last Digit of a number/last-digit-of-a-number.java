//{ Driver Code Starts

// } Driver Code Ends
//Back-end complete function Template for Java
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Print the last digit
        int ld;
        ld = n%10;
        if(n<0){
            ld = (-1)*n%10;
        }
        System.out.print(ld);
    }
}

//{ Driver Code Starts.
// } Driver Code Ends