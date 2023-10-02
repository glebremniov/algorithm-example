package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class DestructorTest {

  private static final String TEST_FILE_SOURCE = "/dataset-extended.csv";
  private final Destructor subject = new Destructor();

  @ParameterizedTest
  @CsvFileSource(resources = TEST_FILE_SOURCE)
  void destruct(int input, int expected) {
    // When
    var actual = subject.destruct(input);

    // Then
    assertEquals(expected, actual);
  }

}