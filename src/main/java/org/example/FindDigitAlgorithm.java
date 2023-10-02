package org.example;

public class FindDigitAlgorithm {

  public int findDigitAt(int n) {
    if (n < 1) {
      return -1;
    }

    if (n < 10) {
      return n;
    }

    int targetNumber = 0;
    int step;

    while (true) {
      step = (int) Math.floor(Math.log10(targetNumber + 1)) + 1;

      if (n < step) {
        break;
      }

      n -= step;
      targetNumber++;
    }

    if (n > 0) {
      targetNumber++;

      while (n <= --step) {
        targetNumber /= 10;
      }
    }

    int result = targetNumber % 10;

    System.out.println("Target number: " + targetNumber);
    System.out.println("Target index: " + n);
    System.out.println("Target digit: " + result);

    return result;
  }

}