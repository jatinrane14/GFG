class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        String binaryString = Integer.toBinaryString(n); 
        int binaryArray[] = binaryString.chars().map(c->c-'0').toArray(); 
        int count =0 ; 
        int max =0 ; 
        for(int i =0;i<binaryArray.length;i++){ 
            if(binaryArray[i] == 1){ 
                count++; 
                
            }else{ 
                count=0; 
                
            } if(max<count){ 
                max = count; 
                
            } 
            
        } 
        return max;
    }
}
