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

      if (n - step * 10 >= 0) {
        n -= step * 10;
        targetNumber += 10;
        continue;
      }

      if (n >= step) {
        n -= step;
        targetNumber++;
        continue;
      }

      if (n == 0) {
        if (targetNumber / 10 >= 1) {
          targetNumber /= 10;
          continue;
        }
      }

      if (n > 0) {
        if (n < --step) {
          targetNumber /= 10;
          continue;
        }
      }

      break;
    }

    int result = targetNumber % 10;

    System.out.println("Target number: " + targetNumber);
    System.out.println("Target index: " + n);
    System.out.println("Target digit: " + result);

    return result;
  }

}