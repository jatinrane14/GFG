//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().leaders(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();    // Ensure new line after each test case output
                System.out.println("~"); // Ensure new line after each test case output
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaderList = new ArrayList<Integer>();
        for(int i =0;i<arr.length;i++){
            boolean flag = false;
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    flag = false;
                    break;
                }
                if(arr[i] >= arr[j]){
                    flag = true;
                    continue;
                } else if(arr[i] < arr[j]){
                    flag = false;
                }
            }
            if(flag == true){
                 leaderList.add(arr[i]);
            }
        }
        leaderList.add(arr[arr.length-1]);
        
        return leaderList;
    }
}
