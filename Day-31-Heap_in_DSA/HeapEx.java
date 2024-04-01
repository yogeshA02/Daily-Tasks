
// we bulid min heap

class MinHeap 
{
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) 
    {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    private int parent(int i) 
    {
        return (i - 1) / 2;
    }

    private int leftChild(int i)
    {
        return 2 * i + 1;
    }

    private int rightChild(int i) 
    {
        return 2 * i + 2;
    }

    private void swap(int i, int j) 
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


    // heapify the up ward all values
    private void heapifyUp(int i) 
    {
        while (i > 0 && heap[parent(i)] > heap[i]) 
        {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    // heapify the down ward all values
    private void heapifyDown(int i) 
    {
        int minIndex = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[minIndex])
            minIndex = left;

        if (right < size && heap[right] < heap[minIndex])
            minIndex = right;

        if (i != minIndex) 
        {
            swap(i, minIndex);
            heapifyDown(minIndex);
        }
    }

    public void insert(int value) 
    {
        if (size == capacity) 
        {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMin() 
    {
        if (size <= 0)
            return -1; // Or throw an exception it can return negative value

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return min;
    }

    public void printHeap() 
    {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
}

public class HeapEx 
{
    public static void main(String[] args) 
    {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(4);

        System.out.print("Min Heap: ");
        minHeap.printHeap();

        System.out.println("Extracted Min: " + minHeap.extractMin());
        System.out.print("Min Heap after extraction: ");
        minHeap.printHeap();
    }
}
