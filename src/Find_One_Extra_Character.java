
/*
Problem : Given two strings s1 and s2 which are of lengths n and n+1. The second string contains all the character of the first string, but there is one extra character. Your task to find the extra character in the second string and return it.
Time Complexity : O(N)
 */
public class Find_One_Extra_Character {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="adcd";
        System.out.println(fun(s1,s2));
    }
    public static char fun(String s1,String s2)
    {
        int res=0;
        int i=0;
        for(;i<s1.length();i++)
        {
            res^=(s1.charAt(i)^s2.charAt(i));
        }
        res^=s2.charAt(i);

        return (char)res;
    }
}
