class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        String sChar[] = s.split("");
        for (int i = 0; i < sChar.length; i++) {
            boolean flag = true;
            for(int j =0;j<sChar.length;j++){
                if(i!=j && sChar[i].equals(sChar[j])){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return (char)sChar[i].charAt(0);
            }
        }
        return '$';
    }
}
