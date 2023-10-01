package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DestructorTest {

  private final Destructor subject = new Destructor();

  @ParameterizedTest
  @CsvSource({
      "1, 1", "2, 2", "3, 3", "4, 4", "5, 5",
      "6, 6", "7, 7", "8, 8", "9, 9", "10, 1",
      "11, 0", "12, 1", "13, 1", "14, 1", "15, 2",
      "16, 1", "17, 3", "18, 1", "19, 4", "20, 1",
      "21, 5", "22, 1", "23, 6", "24, 1", "25, 7",
      "26, 1", "27, 8", "28, 1", "29, 9", "30, 2",
      "31, 0", "32, 2", "33, 1", "34, 2", "35, 2",
      "36, 2", "37, 3", "38, 2", "39, 4", "40, 2",
      //"1000, 3", "100000, 2", "100000000, 8", "1000000000, 1",
  })
  void destruct(int input, int expected) {
    // When
    var actual = subject.destruct(input);

    // Then
    assertEquals(expected, actual);
  }

}