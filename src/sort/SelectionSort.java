package sort;

public class SelectionSort {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 1, 1, 1, -2};
        int[] arr = {10, 22, 40, 2, -3, 111};
        selectionSort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
