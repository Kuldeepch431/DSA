/*
Problem : Given a N x N matrix M. Write a program to find count of all the distinct elements common to all rows of the matrix. Print count of such elements.
Time Complexity : O(N*N)
 */
public class Find_Distinct_Elements {
    public static void main(String[] args) {
        int N = 4;
        int [][] M = {{2, 1, 4, 3},
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}};

        System.out.println("Result is :"+distinct(M,N));
    }
    public static int distinct(int M[][], int N) {
        // code here
        Set<Integer> set1 = new HashSet<>();

        for(int i:M[0])
            set1.add(i);

        for(int i=0;i<N;i++)
        {
            Set<Integer> set2 = new HashSet<>();
            for(int j=0;j<N;j++)
            {
                if(set1.contains(M[i][j]))
                    set2.add(M[i][j]);
            }
            set1 = set2;
        }
        return set1.size();
    }
}
