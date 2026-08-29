class Solution {
    public int majorityElement(int[] nums) {
        
        int fin=0;
        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j&&nums[i]==nums[j]){
                    count++;
                }

            }
            if(count>nums.length/2){
                fin=nums[i];
                break;
            }

        }
        return fin;
    }
}