//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        int even =0,odd=0;
        for(int i=0;i<=N;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(even);
        ls.add(odd);
        return ls;
    }
}