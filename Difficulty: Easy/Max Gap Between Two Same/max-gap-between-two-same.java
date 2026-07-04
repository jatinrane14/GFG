class Solution {
    public int maxCharGap(String s) {
        // code here
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);

        int maxGap = -1;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (firstIndex[idx] == -1) {
                firstIndex[idx] = i;
            } else {
                maxGap = Math.max(maxGap, i - firstIndex[idx] - 1);
            }
        }

        return maxGap;
        
    }
};