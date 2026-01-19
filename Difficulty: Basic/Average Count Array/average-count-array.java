// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public ArrayList<Integer> countArray(int[] arr, int x) {
        // Complete the function
        HashMap<Integer,Integer> hashValue = new HashMap<>();
        for(int num : arr){
            hashValue.put(num,hashValue.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int avg = (arr[i]+x)/2;
            ls.add(hashValue.getOrDefault(avg,0));
        }
        return  ls;
    }
}
