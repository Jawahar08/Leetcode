class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minidx=0;
        int maxidx=0;
        for(int i=1;i<n;i++){
            
                if(nums[i]<nums[minidx]){
                    minidx=i;
                }
                if(nums[i]>nums[maxidx]){
                    maxidx=i;
                }
            }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);

        int opt1=right+1;
        int opt2=n-left;
        int opt3=(left+1)+(n-right);
        
        int result=Math.min(opt1,Math.min(opt2,opt3));
        return result;
    }
}