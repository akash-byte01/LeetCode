class Solution {
    public boolean isAnagram(String s, String t) {
        
        int []freq=new int[256];

        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int j=0;j<t.length();j++)
        {
            freq[t.charAt(j)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}