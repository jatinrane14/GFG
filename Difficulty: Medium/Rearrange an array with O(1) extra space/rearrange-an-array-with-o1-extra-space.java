class Solution {
    public void arrange(long[] arr) {
        long n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[(int) arr[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }
    }
}