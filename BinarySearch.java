public class BinarySearch {

    public static int Binary_Search(int numbers[], int key) {

        int l = 0;
        int r = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            while (l <= r) {
                int mid = (l + r) / 2;
                if (numbers[mid] == key) {
                    return mid;
                }
                if (key < numbers[2]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }

        }
        return -1;

    }

    public static void main(String[] args) {

        int numbers[] = { 2, 4, 6, 7, 9, 10 };
        int key = 2;

        int index = Binary_Search(numbers, key);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + index);
        }

    }

}
