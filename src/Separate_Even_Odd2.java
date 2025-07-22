import java.util.ArrayList;
import java.util.List;

public class Separate_Even_Odd2 {
    public static void main(String[] args) {
        int arr[]={4,2,6,2,7,9,10,3,12};
        int res [] = stableEvenOdd(arr);

        for(int i:res)
        {
            System.out.print(" "+i);
        }

    }
    public static int[] stableEvenOdd(int arr[])
    {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for(int i:arr)
        {
            if(i%2==0)
                evens.add(i);
            else
                odds.add(i);
        }

        evens.addAll(odds);
        return evens.stream().mapToInt(i -> i).toArray();
    }
}
