package test;

public class Test {

    public static void sort(int[] arr, int low, int high) {
      if (low < high) {
        // pi is partitioning index
        int pi = partition(arr, low, high);
 
        // Recursively sort elements on both sides of the pivot
        sort(arr, low, pi - 1);
        sort(arr, pi + 1, high);
      }
    }
 
    static int partition(int[] arr, int low, int high) {
      int pivot = arr[high];              // here pivot is the last element most 
      										// optimal is to choose random element
      int i = (low - 1);                      // index of smaller element
 
      for (int j = low; j <= high - 1; j++) {
        // If current element is smaller than the pivot
        if (arr[j] < pivot) {
          i++;
          swap(arr, i, j);
        }
      }
      swap(arr, i + 1, high);
      return (i + 1);
    }
      //Helper method to swap two elements 
    static void swap(int[] arr, int a, int b) {
      int temp = arr[a];
      arr[a] = arr[b];
      arr[b] = temp;
    }
  }