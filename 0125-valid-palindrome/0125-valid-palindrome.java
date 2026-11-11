class Solution {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;

        while(start<end)
        {
            char l= Character.toLowerCase(s.charAt(start));
            char r= Character.toLowerCase(s.charAt(end));

            if(!Character.isLetterOrDigit(l))
            {
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(r))
            {
                end--;
                continue;
            }
            if(l!=r)
            {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}