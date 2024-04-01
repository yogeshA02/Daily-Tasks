import java.util.PriorityQueue;

public class KthLargestElement 
{

    public static int findKthLargest(int[] nums, int k) 
    {
        // Create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements to the min heap
        for (int num : nums) 
        {
            minHeap.add(num);
            // If size exceeds k, remove the smallest element
            if (minHeap.size() > k)
                minHeap.poll();
        }

        // kth largest element is at the top of the min heap that will return
        return minHeap.peek();
    }

    public static void main(String[] args) 
    {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
    }
}
