class Solution {
    public void deleteMid(Stack<Integer> s) {
        // code here
        if (s.isEmpty()) return;

        int size = s.size();
        // Calculate middle index from the top (0-indexed)
        int midIndexFromTop = size / 2; 

        Stack<Integer> temp = new Stack<>();

        // Step 1: Pop and store elements until reaching the middle
        for (int i = 0; i < midIndexFromTop; i++) {
            temp.push(s.pop());
        }

        // Step 2: Remove the middle element
        s.pop();

        // Step 3: Push the stored elements back onto the original stack
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }
}