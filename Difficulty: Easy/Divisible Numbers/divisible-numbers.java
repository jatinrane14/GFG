class Solution {
    public int nextDivisible(int x, int y) {
        // code here
        x++;
        int rem = x % y;
        if (rem == 0) return x;
        return x + (y - rem);
    }
}