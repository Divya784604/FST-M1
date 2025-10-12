package Activities;

public class Activity4
{
    public static void main(String[] args) {
        int[] numbers = {29, 10, 14, 37, 13};

        System.out.println("Before Sorting:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After Sorting:");
        printArray(numbers);
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

