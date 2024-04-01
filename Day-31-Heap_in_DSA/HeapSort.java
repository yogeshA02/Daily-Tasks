

public class HeapSort 
{
    public static void heapSort(int[] arr) 
    {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap one by one to swap 
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap for remaning
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) 
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) 
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    // After the sorting the print array
    public static void printArray(int[] arr) 
    {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }


    public static void main(String[] args) 
    {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);

        heapSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
