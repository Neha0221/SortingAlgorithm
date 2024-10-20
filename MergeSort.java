class MergeSort{
   
    public static void diviAndCon(int arr[],int low,int high){
        
        if(low<high){
            int mid=low+(high-low)/2;
            diviAndCon(arr,low,mid);
            diviAndCon(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        

        
    }
    public static void merge(int arr[],int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;

        int leftArray[]=new int[n1];
        int rightArray[]=new int[n2];

        for(int i=0;i<n1;i++){
            leftArray[i]=arr[low+i];
        }

        for(int i=0;i<n2;i++){
            rightArray[i]=arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=low;

        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                k++;
                i++;
            }
            else{
                arr[k]=rightArray[j];
                k++;
                j++;
            }
        }

        while(i<n1){
            arr[k]=leftArray[i];
            k++;
            i++;
        }

        while(j<n2){
            arr[k]=rightArray[j];
            k++;
            j++;
        }
    }
    public static void main(String args[]){
        int arr[]={5,2,4,8,1,9,8};
        int n=arr.length;
        diviAndCon(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }   
    }
}
//    l     m         h
//    0 1  2 3     4 5   6
// 5,2, 4,8   ,1,9,   8

// Time Complexity of Merge Sort
// 1. Divide Step:
// In each recursive step, the array is divided into two halves. This process takes constant time O(1), but it is done recursively, and the depth of recursion is logn because each time the problem size is halved.

// 2. Conquer Step (Merge Step):
// The merging process takes linear time O(n) for each level of recursion. This is because we must go through every element in both subarrays being merged.

// At each level of recursion, the merging of subarrays takes a total of O(n) time (where n is the number of elements in the array).

// 3. Overall Time Complexity:
// The recursion tree has a depth of logn, and at each level, we are performing a merging step that takes 

// O(n). Thus, the overall time complexity can be computed as:This is because we have 

// logn levels of recursion and each level requires O(n) work for merging.

// Best Case, Average Case, and Worst Case:
// Best Case: 
// O(nlogn) — The merge sort algorithm always divides the array into two equal halves and merges them back in linear time, regardless of the input's nature (whether sorted, reverse sorted, or random).

// Average Case: 

// O(nlogn) — The splitting and merging processes occur similarly for any random input.

// Worst Case: 

// O(nlogn) — Even in the worst-case scenario, the array is split and merged in the same way, ensuring a logarithmic number of levels and linear merging time at each level.

// Space Complexity of Merge Sort:O(n)

// The extra space is required to store the temporary arrays (leftArray and rightArray) used during the merge process. For each merge step, the algorithm uses additional space proportional to the size of the subarrays being merged, leading to O(n) space complexity overall.
// Summary of Merge Sort Complexity:
// Time Complexity: O(nlogn) in all cases (best, average, and worst).
// Space Complexity: O(n) due to the additional arrays used for merging.


