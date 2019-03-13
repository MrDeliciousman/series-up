package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Array3Test {

  static final int[] INPUT = {3,4,2};

  private static Object[][] seriesUp() {
    return new Object[][] {
        {3, new int[] {1, 1, 2, 1, 2, 3}},
        {4, new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}},
        {2, new int[] {1, 1, 2}}
    };
  }

  @ParameterizedTest
  @MethodSource
  void seriesUp(int input, int[] expected) {
    assertArrayEquals(expected, Array3.seriesUp(input));
  }
}