class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] result = new int [nums.length];
        int n=0,l=nums.length - 1;
        for(int num : nums)
        {
            if(num%2==0)
            {
                result[n]=num;
                n++;
            }
            else
            {
                result[l]=num;
                l--;
                if(l<0)
                return result;
            }
        }
        return result;
    }
}