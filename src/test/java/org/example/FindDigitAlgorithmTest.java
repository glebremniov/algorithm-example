package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FindDigitAlgorithmTest {

  private static final String TEST_FILE_SOURCE = "/dataset-extended.csv";

  private final FindDigitAlgorithm subject = new FindDigitAlgorithm();

  @ParameterizedTest
  @CsvFileSource(resources = TEST_FILE_SOURCE)
  void should_ReturnExpectedDigit_When_GivenNumber(int input, int expected) {
    // When
    var actual = subject.findDigitAt(input);

    // Then
    assertEquals(expected, actual);
  }

}