import java.util.ArrayList;
import java.util.Collections;

public class Pairsum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int targetSum = 6;

        // Sort the ArrayList
        Collections.sort(list);

        findPairs(list, targetSum);
    }

    public static void findPairs(ArrayList<Integer> list, int targetSum) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);
            if (sum == targetSum) {
                System.out.println("Pair: (" + list.get(left) + ", " + list.get(right) + ")");
                left++;
                right--;
            } else if (sum < targetSum) {
                left++;
            } else {
                right--;
            }
        }
    }
}
