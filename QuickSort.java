// 0   1   2    3     4     5    6   7     8
// 15  9   7   13    12    16    4   18   11 

// first pass 
// 11   9   7   4    12    16    13   18  15         

// divi
// 0   1    2   3           4   5   6   7   8
// 11  9    7   4           12  16  13  18  15
//                              i    j
// 4   9    7   11          12  13   16  18  15

class QuickSort{
    public static void main(String args[]){
        int arr[]={15,9,7,13,12,16,4,18,11};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

     public static int partition(int arr[],int low,int high){
        int pi=arr[low+(high-low)/2];
        while(low<=high){
            while(arr[low]<pi){
            low++;
        }

            while(arr[high]>pi){
                high--;
            }


        if(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }

        }
        
        return low;

    }

    public static void quickSort(int arr[],int low,int high){
        int n=arr.length;

        if(low<high){
            int pivot=partition(arr,low,high);

            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot,high);
        }
        

    }

   
}


// The time complexity of Quick Sort depends on the choice of the pivot and how well the array is partitioned during each recursive step. Let's break down the different scenarios and average-case analysis of Quick Sort:

// 1. Best Case Time Complexity: O(n log n)
// The best case occurs when the pivot divides the array into two equal (or nearly equal) parts at each step, ensuring that both halves of the array are recursively sorted efficiently.

// Pivot Selection: If the pivot is the median or close to the median, the partition is balanced.
// Recursion Depth: Each time, the array size reduces to half, leading to a recursion depth of log n.
// Work per Level: At each recursion level, the partition() function processes n elements, because every element is compared against the pivot.
// Thus, the overall time complexity in the best case is: 

// 2. Average Case Time Complexity: O(n log n)
// The average case occurs when the pivot is not perfectly dividing the array into two equal parts but still divides it reasonably well. In this case:

// On average, each partition step will reduce the problem size by a constant fraction, typically resulting in a recursion depth of approximately log n.
// The amount of work done at each level is still linear (i.e., comparing all elements to the pivot).
// Thus, in the average case, the time complexity is also: 


// 3. Worst Case Time Complexity: O(n²)
// The worst case occurs when the pivot divides the array in a highly unbalanced manner, such as when the pivot is always the smallest or the largest element (e.g., when the array is already sorted or reverse sorted).

// Pivot Selection: If the pivot is consistently the smallest or largest element, one partition is empty, and the other contains the rest of the array.
// Recursion Depth: In this case, the recursion depth becomes n (as each partition step reduces the size by only one element).
// Work per Level: The partition process still involves n comparisons, resulting in quadratic time complexity.
// Thus, in the worst case, the time complexity becomes: 


// 4. Space Complexity: O(log n) (in-place sorting)
// Quick Sort is an in-place sorting algorithm, meaning it doesn't require additional space proportional to the input size. However, the recursive calls require space in the call stack.

// Best/Average Case Space Complexity: The recursion depth is O(log n) due to the balanced nature of partitioning.
// Worst Case Space Complexity: In the worst case, the recursion depth is O(n) because of highly unbalanced partitioning.
// Summary of Time Complexity:
// Best Case: O(n log n)
// Average Case: O(n log n)
// Worst Case: O(n²)
// Comparison with Other Sorting Algorithms:
// Merge Sort: O(n log n) in the best, average, and worst cases, but it requires additional space O(n).
// Heap Sort: O(n log n) in all cases but often slower in practice than Quick Sort due to the constant factors involved.
// Quick Sort's average-case performance and in-place sorting make it one of the most commonly used sorting algorithms in practice.


                 


