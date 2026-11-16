class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;

        char[] arr=s.toCharArray();

        while(left<right)
        {
            while(left < right && "aeiouAEIOU".indexOf(arr[left])==-1)
            {
                left++;
            }
            while(left < right && "aeiouAEIOU".indexOf(arr[right])==-1)
            {
                right--;
            }

            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}