class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            
            if (map.containsKey(complement)) {
                res.add(complement);
                res.add(arr[i]);
                return res;
            }
            
            map.put(arr[i], i);
        }
        return res;
    }
}