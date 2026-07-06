class Solution {
    public int maxPathSum(int[] a, int[] b) {
        // code here
        int result =0;
        int i=0; // pointer for arr 1 (a)
        int j=0; // - -- --- -- - - 2 (b)
        int sum1 =0;
        int sum2 =0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                sum1+=a[i++];
            }else if(b[j]<a[i]){
                sum2+=b[j++];
            }else if(a[i] == b[j]){
                result += Math.max(sum1,sum2) + a[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<a.length){
            sum1 += a[i++];
        }
        while(j<b.length){
            sum2 += b[j++];
        }
        result += Math.max(sum1,sum2);
        
        return result;
        
    }
}