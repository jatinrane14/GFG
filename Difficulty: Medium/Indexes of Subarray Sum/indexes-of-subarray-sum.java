
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left =0;
        int currentSum=0;
        for(int right =0;right<arr.length;right++){
            currentSum += arr[right];
            while(currentSum > target && left<=right){
                currentSum -= arr[left];
                left++;
            }
            if(currentSum == target){
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(left+1);
                ls.add(right+1);
                return ls;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        return res;
    }
}
