class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;

            for(int j=i-1;j>=0;j--)
            {
                sum=sum+nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                sum=sum-nums[k];
            }

            if(sum==0)
            {
                return i;
            }
        }
        return -1;
    }
}