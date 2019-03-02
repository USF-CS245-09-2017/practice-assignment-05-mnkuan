
public class InsertionSort implements SortingAlgorithm {
  /**
   * The main sorting method for insertion sort
   * 
   * @param a the array that will be sorted
   */
  public void sort(int [] a) {
    for (int i = 1; i < a.length; i++) {
      int value = a[i];
      int j = i - 1;
      
      while (j >= 0 && a[j] > value) {
        a[j + 1] = a[j];
        j--;
      }
      
      a[j + 1] = value;
    }
  }
}
