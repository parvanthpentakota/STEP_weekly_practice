package Week03_04_Sorting_Searching;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 8};

        bubbleSort(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}