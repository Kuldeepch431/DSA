/*
Problem : Given two non-empty strings s1 and s2, consisting only of lowercase English letters, determine whether they are anagrams of each other or not. Two strings are considered anagrams if they contain the same characters with exactly the same frequencies, regardless of their order.
Time Complexity : O(N)
*/
public class areAnagram {
    public static void main(String[] args) {
        System.out.println(fun("abc","bac"));
    }
    public static boolean fun(String s1,String s2)
    {
        int freq[] = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i:freq)
        {
            if(i!=0) return false;
        }
        return true;
    }
}
