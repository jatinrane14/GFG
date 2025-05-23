//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            int k = sc.nextInt();
            sc.nextLine(); // consume the newline
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            Solution ob = new Solution();
            int res = ob.binarysearch(arr, k);
            System.out.println(res);

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int recursiveSearch(int arr[],int target,int low,int high){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        
        if(arr[mid]==target){
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            } else {
                return recursiveSearch(arr, target, low, mid - 1);
            } 
        }
        else if(arr[mid]<target){
            return recursiveSearch(arr,target,mid+1,high);
        }
        return recursiveSearch(arr,target,low,mid-1);
    }
    public int binarysearch(int[] arr, int k) {
        // Code Here
        return recursiveSearch(arr,k,0,arr.length-1);
        
    }
}