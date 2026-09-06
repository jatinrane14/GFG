class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =1;i<Math.round(Math.sqrt(n))+1;i++){
            if(n%i == 0){
                res.add(i);
                if(n/i!=i){
                    res.add(n/i);
                }
            }
        }
        Collections.sort(res);
        return res;
        
    }
}