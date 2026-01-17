// User function Template for Java

class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here\
        List<Integer> ls = new ArrayList<>();
        int i =1 ;
        for(Integer elem : nums){
            if(elem == i){
                ls.add(i);
            }
            i++;
        }
        return ls;
    }
}