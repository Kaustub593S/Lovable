class Solution
{
    /**
     * You're given a string of lowercase letters and a number K. Find the length of the longest substring that contains at most K distinct vowels. Consonants don't count toward the K limit but they can be inside the window.
     * Example: s = "aabacbebebe", K = 2 → answer is 7 ("cbebebe" has e and b — only 1 distinct vowel)
     */
    public int substringKvowels(String s,int k)
    {
        int start=0;
        int count=0;
        int freq[]=new int[26];
        int distinctvowels=0;
        for(int end=0;end<s.length();end++)
        {
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u')
            {
                if(freq[s.charAt(end)-'a']==0)
                {
                    distinctvowels++;
                }
                freq[s.charAt(end)-'a']++;

                while(distinctvowels>k)
                {
                    if(s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u')
                    {
                        freq[s.charAt(start)-'a']--;
                        if(freq[s.charAt(start)-'a']==0)
                            distinctvowels--;
                    }
                    start++;
                }

            }
            count=Math.max(count,end-start+1);

        }
        return count;
    }
}