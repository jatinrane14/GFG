class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> ls = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                ls.add(arr[i]);
            }
        }
        return ls;
    }
}