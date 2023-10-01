package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DestructorTest {

  private final Destructor subject = new Destructor();

  @ParameterizedTest
  @MethodSource("validArguments")
  void destruct(int input, int expected) {
    // When
    var actual = subject.destruct(input);

    // Then
    assertEquals(expected, actual);
  }


  private static Stream<Arguments> validArguments() {
    return Stream.of(
        arguments(1, 1),
        arguments(2, 2),
        arguments(9, 9),
        arguments(10, 1),
        arguments(15, 3)
    );
  }

}