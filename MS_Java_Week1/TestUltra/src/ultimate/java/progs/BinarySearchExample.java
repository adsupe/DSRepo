package ultimate.java.progs;

class BinarySearchExample {
    // Returns index of x if it is present in arr[l....r], else return -1
    int binarySearch(int arr[], int low, int high, int target)
    {
        while (low <= high) {
            int mid = (low + high) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == target) {
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (arr[mid] > target) {
                high = mid - 1;
 
            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
              low = mid + 1;
            }  
        }
 
        // We reach here when element is not present
        //  in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearchExample ob = new BinarySearchExample();
 
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int target = 10;
        int result = ob.binarySearch(arr, 0, n - 1, target);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found "+target+" at index "
                               + result);
    }
}
