package Lab;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperations {
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array; // Return input array if it's empty or null
        }

        List<Integer> uniqueList = new ArrayList<>();
        for (int element : array) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    public static int sumArray(int[] array) {
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

}

