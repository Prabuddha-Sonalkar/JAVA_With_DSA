public class PairOfArray {

    public static void Pair_Of_Array(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int curr = numbers[i];
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        Pair_Of_Array(numbers);
    }

}
