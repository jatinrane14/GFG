class Solution {
    private int findValue(int n,int r){
        //  n -> r, r-> c
        int res = 1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    } 
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int c=1;c<=n;c++){
            res.add(findValue(n-1,c-1));
        }
        
        return res;
    }
}