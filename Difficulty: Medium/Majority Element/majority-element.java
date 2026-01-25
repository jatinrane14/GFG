class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> hashMp = new HashMap<>();
        
        for(int elem : arr){
            hashMp.put(elem,hashMp.getOrDefault(elem,0)+1);
        }
        
        for(int key : hashMp.keySet()){
            if(hashMp.get(key) > n/2){
                return key;
            }
        }
        
        return -1;
    }
}