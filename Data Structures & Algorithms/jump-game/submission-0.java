class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int max=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(i>max){
                return false;
            }
            else{
                j=i+nums[i];
                if(j>max){
                    max=j;
                }

            }
        }
            return true;
        
    }
}
