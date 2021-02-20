package com.dayakar.searching;
/*
MergeSort(arr[], l,  r)
If r > l
     1. Find the middle point to divide the array into two halves:
             middle m = (l+r)/2
     2. Call mergeSort for first half:
             Call mergeSort(arr, l, m)
     3. Call mergeSort for second half:
             Call mergeSort(arr, m+1, r)
     4. Merge the two halves sorted in step 2 and 3:
             Call merge(arr, l, m, r)
 */
public class MergeSortDemo {

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("Given Array: ");
        printArray(arr);
        MergeSortDemo merge=new MergeSortDemo();
        //merge.sort(arr,0,arr.length-1);
        merge.sortArray(arr,0,arr.length-1);
        System.out.println("\nSorted Array: ");
        printArray(arr);
    }
      //merge two subArrays
      // First subarray is arr[l..m]
      // Second subarray is arr[m+1..r]
    private void merge(int[] array,int l,int r,int m){
        /*find sizes of two subarrays to be merged*/
        int n1=m-l+1;
        int n2=r-m;
        //create two temp arrays
        int[] L=new int[n1];
        int[] R=new int[n2];

        /*Copy data to temp arrays*/

        for (int i=0;i<n1;i++){
            L[i]=array[l+i];
        }
        for (int j = 0; j < n2; j++)
            R[j] = array[m + 1 + j];
        /* Merge the temp arrays */

        //intial index should be i=0;j=0;
        int i=0;
        int j=0;

        int k=l;
        while (i<n1 &&j<n2){
            if (L[i]<=R[j]){
                array[k]=L[i];
                i++;
            }else{
                array[k]=R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }
    private void sort(int[] array,int l,int r){
              if (l<r){
                  //find middle
                  int m=(l+r)/2;
                  sort(array,l,m);       //sort first half
                  sort(array,m+1,r);  //sort second half
                  merge(array,l,r,m);    //merge sorted halves

              }
    }

    private void sortArray(int[] array,int l,int r){

        if (l<r){
            int m=(l+r)/2;
            sortArray(array,l,m);
            sortArray(array,m+1,r);
            mergeArray(array,l,r,m);

        }
    }

    private void mergeArray(int[] array,int l,int r,int m){
        //find size of two arrays
        int n1=m-l+1;
        int n2=r-m;

        //create two temp arrays
        int L[]=new int[n1];
        int R[]=new int[n2];

        //copy values to temp arrays
        for (int i=0;i<n1;i++){
            L[i]=array[l+i];
        }

        for (int j=0;j<n2;j++){
            R[j]=array[m+1+j];
        }

        int i=0;
        int j=0;
        int k=l;

        while (i<n1 && j<n2){
            if (L[i]<R[j]){
                array[k]=L[i];
                i++;
            }else{
                array[k]=R[j];
                j++;
            }
            k++;
        }
       //copy remaining elements

        while (i<n1){
            array[k++]=L[i++];
        }
        while ((j<n2)){
            array[k++]=R[j++];
        }


    }

    private static void printArray(int[] array){
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
