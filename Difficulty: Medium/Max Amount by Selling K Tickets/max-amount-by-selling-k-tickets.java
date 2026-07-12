class Solution {
    static int MOD = 1000000007;
    public int maxAmount(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> q =  new PriorityQueue<>((a,b)->b-a);
        for(int elem : arr){
            q.offer(elem);
        }
        int i =0;
        long sum=0;
        while(i<k){
            int temp = q.poll();
            sum+=temp;
            if(temp>1){
            q.offer(temp-1);
                
            }else{
                q.offer(0);
            }
            i++;
        }
        
        return (int)(sum%MOD);
        
    }
}