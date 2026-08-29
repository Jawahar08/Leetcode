class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i>sum){
                return false;
            }
            sum=Math.max(sum,i+nums[i]);
            
        }
        return true;
        
        
        
    }
    
}