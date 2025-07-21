import java.util.Map;
import java.util.TreeMap;

public class ProcessFile {
    public static void main(String[] args) {
        //int n =fun();
    }

    public static int fun(int []original,int []refactored) {

        // Using TreeMap to automatically sort by keys
        Map<Integer, Integer> sortedMap = new TreeMap<>();

        // Storing values in map
        for (int i = 0; i < original.length; i++) {
            sortedMap.put(original[i], refactored[i]);
        }

        // logic for getting min cycle count
        int minCycle=0;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){
            int min =(int) Math.min(entry.getKey(), entry.getValue());
            if(minCycle<=min)
            {
                minCycle = min;
            }
            else {
                minCycle = (int)(Math.max(entry.getKey(), entry.getValue()));
            }
        }

        return minCycle;
    }
}
