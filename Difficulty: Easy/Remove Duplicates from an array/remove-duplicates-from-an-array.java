class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            s.add(arr[i]);
            arr[i]=0;
        }
        for(int it : s){
            ls.add(it);
        }
        return ls;
        
    }
}