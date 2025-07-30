class Solution {
    public boolean isValid(String s) {
        // code here
        String parts[] = s.split("\\.");
        if(parts.length!=4){
            return false;
        }
        for (int i = 0; i < parts.length; i++) {
            try{
                if(parts[i].isEmpty()){
                return false;
                }
                if (parts[i].length() > 1 && parts[i].startsWith("0")){
                 return false;
                }    
                if (Integer.parseInt(parts[i])<0 || Integer.parseInt(parts[i])>255) {
                    return false;
                }
            }catch(NumberFormatException e){
                return false;
            }
            
        }
        return true;
    }
}