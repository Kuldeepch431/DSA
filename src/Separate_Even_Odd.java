Time Complexity : O(N)
public class Separate_Even_Odd {
    public static void main(String[] args) {
        int arr[]={4,2,6,2,7,9,10,3,12};
        int res [] = fun(arr);

        for(int i:res)
        {
            System.out.print(" "+i);
        }

    }
    public static int[] fun(int arr[])
    {
        int i=0;
        int j=arr.length-1;

        while(i<=j) {
            while (i <= j && arr[i] % 2 == 0) {
                //even
                i++;
            }
            while (i <= j && arr[j] % 2 != 0) {
                //odd
                j--;
            }
            //here i has stopped at odd no and j at even
            if (i < j) swap(arr, i, j);
        }
        return arr;
    }
    public static void swap(int arr[], int i,int j)
    {
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}
