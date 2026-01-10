class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int n1 = a.length;
        int n2 = b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0;
        int j=0;
        ArrayList<Integer> ls = new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
            else{
                ls.add(a[i]);
                i++;
                j++;
            }
        }
        return ls.size();
    }
}