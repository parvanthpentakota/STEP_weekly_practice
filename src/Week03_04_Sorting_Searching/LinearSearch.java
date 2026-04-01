package Week03_04_Sorting_Searching;

public class LinearSearch {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9};

        System.out.println(search(arr, 1));
    }
}
