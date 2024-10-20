class HeapSort{
    public static void sort(int arr[],int n){
        // O(n/2)
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        // O(n)
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,i,0);
        }

    }

    public static void heapify(int arr[],int n,int i){
        int largest=i;
        int leftChildIdx=2*i+1;
        int rightChildIdx=2*i+2;

        
        if(leftChildIdx<n && arr[largest]<arr[leftChildIdx]){
            largest=leftChildIdx;
        }

        if(rightChildIdx<n && arr[largest]<arr[rightChildIdx]){
            largest=rightChildIdx;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }

    }
    public static void main(String args[]){
        int arr[]={9,4,3,8,10,2,5};
        int n=arr.length;
        sort(arr,n);

        System.out.print("arr: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/**
 *Conclusion of Time Complexity for Heap Sort:
Building the Max Heap takes O(n) time due to the efficient arrangement of elements,
even though individual heapify operations can take O(log n). 
The overall process is linear because heapify is called fewer times for deeper levels, 
which have smaller subtrees.

Heapify Operation takes O(log n) time in the worst case because it depends on the height of the binary heap,
which is log n for a complete binary tree. In the worst case, a node might need to traverse from the root 
to a leaf (logarithmic in depth), causing the recursive calls to continue for log n levels.

Sorting (Extracting elements) involves n iterations, where each iteration involves a heapify operation of O(log n) 
time. Thus, sorting takes O(n log n) time.

------------------------------------------------

Overall Time Complexity:
The total time complexity of Heap Sort is O(n log n) in all cases (best, average, and worst). 
This makes it a consistent and efficient sorting algorithm for large datasets.

Space Complexity: O(1) since Heap Sort is an in-place sorting algorithm, meaning it does not require 
extra space proportional to the input size.

-------------------------------------------------

Summary:
Heapify's O(log n) complexity arises from its dependence on the height of the binary heap.
Heap Sort is an efficient and reliable sorting algorithm with O(n log n) complexity and minimal space usage. 
 * 
 */