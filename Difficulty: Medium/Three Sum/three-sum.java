class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Set<ArrayList<Integer>> st = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            Set<Integer> mid = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int third = -(arr[i]+arr[j]);
                if(mid.contains(third)){
                    ArrayList<Integer> temp = new 
                        ArrayList<>(Arrays.asList(arr[i],arr[j],third));
                    Collections.sort(temp);
                    st.add(temp);
                }
                mid.add(arr[j]);
            }
        }
        
        res.addAll(st);
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < 3; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });
        return res;
        
    }
}
