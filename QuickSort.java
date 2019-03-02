
public class QuickSort implements SortingAlgorithm {
  public void sort(int[] a) {
    quickSort(a, 0, a.length - 1);
  }
  
  private void quickSort(int[] a, int left, int right) {
    if (left < right) {
      int pivot = partition(a, left, right);
      quickSort(a, left, pivot - 1);
      quickSort(a, pivot + 1, right);
    }
  }
  
  /**
   * The partition method of quick sort
   * 
   * @param a the array that will be sorted
   * @param left the smaller element
   * @param right the bigger element
   * @return the new pivot
   */
  private int partition(int[] a, int left, int right) {
    if (left < right) {
      int pivot = left;
      int i = left + 1;
      int j = right;
      
      while (i < j) {
        while(i <= right && a[i] <= a[pivot]) {
          i++;
        }
        
        while (j >= i && a[j] > a[pivot]) {
          j--;
        }
        
        if (i <= right && i < j) {
          swap(a, i, j);
        }
      }
      
      swap(a, pivot, j);
      return j;
    }
    
    return left;
  }
  
  /**
   * Swaps the two indexes of the array
   * 
   * @param a the array that will have its indexes swapped
   * @param i one of the indexes that will swap
   * @param j one of the indexes that will swap
   */
  private void swap(int[] a, int i, int j) {
    int temp = a[j];
    a[j] = a[i];
    a[i] = temp;
  }
}
