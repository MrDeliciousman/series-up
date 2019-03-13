package edu.cnm.deepdive;

public class Array3 {

  public static int[] seriesUp(int n) {
    int[] result = new int[n * (n + 1) / 2];
    int position = 0;
    for (int set = 1; set <= n; set++) {
      for (int value = 1; value <= set; value++) {
        result[position++] = value;
      }
    }
    return result;
  }

}
