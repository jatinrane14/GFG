class Solution {
    public String reFormatString(String s, int k) {
        // code here
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                str.append(Character.toUpperCase(c));
            }
            if(Character.isDigit(c)){
                str.append(c);
            }
        }
        if(str.isEmpty()){
            return "";
        }
        StringBuilder res = new StringBuilder();

        int n = str.length();

        // Size of first group
        int firstGroup = n % k;
        if (firstGroup == 0) {
            firstGroup = k;
        }

        // Add first group
        for (int i = 0; i < firstGroup; i++) {
            res.append(str.charAt(i));
        }

        // Add remaining groups
        for (int i = firstGroup; i < n; i += k) {
            res.append('-');

            for (int j = i; j < Math.min(i + k, n); j++) {
                res.append(str.charAt(j));
            }
        }

        return res.toString();
        
        
    }
};