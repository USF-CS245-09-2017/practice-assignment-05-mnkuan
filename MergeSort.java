import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
  /**
   * main sorting method
   * 
   * @param a the array the will be sorted through merge sort
   */
  public void sort(int[] a) {
    if (a.length > 1) {
      int[] left = getLeft(a);
      int[] right = getRight(a);
      
      sort(left);
      sort(right);
      merge(a, left, right);
    }
  }
  
  /**
   * @param a the array that will have its right half returned
   * @return right half of the array
   */
  private int[] getRight(int[] a) {
    return Arrays.copyOfRange(a, a.length / 2, a.length);
  }
  
  /**
   * @param a the array that will have its left half returned
   * @return left half of the array
   */
  private int[] getLeft(int[] a) {
    return Arrays.copyOfRange(a, 0, a.length / 2);
  }
  
  /**
   * the merge part of the sorting algorithm
   * 
   * @param target new sorted array
   * @param left left half of the array
   * @param right right half of the array
   */
  private void merge(int[] target, int[] left, int[] right) {
    int target_index = 0, left_index = 0, right_index = 0;
    
    while (left_index < left.length && right_index < right.length) {
      if (left[left_index] <= right[right_index]) {
        target[target_index++] = left[left_index++];
      } else {
        target[target_index++] = right[right_index++];
      }
    }
    
    while (left_index < left.length) {
      target[target_index++] = left[left_index++];
    }
    
    while (right_index < right.length) {
      target[target_index++] = right[right_index++];
    }
  }
}
