class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int index  = txt.indexOf(pat);
        return  index>=0?index:-1;
    }
}