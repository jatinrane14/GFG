class Solution {
    
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        int ans = 1;
        for(int c=1;c<n;c++){
            ans = ans*(n-c);
            ans = ans/c;
            res.add(ans);
        }
        
        return res;
    }
}