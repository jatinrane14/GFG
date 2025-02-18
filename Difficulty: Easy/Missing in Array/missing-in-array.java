//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int arr[]) {
        // code here
        long n = arr.length+1;
        long expSum = (n*(n+1))/2;
        long actSum =0;
        for(int i =0;i<arr.length;i++){
            actSum+=arr[i];
        }
        
        int missNum = (int)(actSum-expSum);
        if(missNum<0){
            return (-1)*missNum;
        }
        return missNum;
    }
}