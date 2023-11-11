package com.tw.step9.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {

  @Test
  void shouldCalculateTheDifferenceOfTwoLengthsInInchAndFeet() {
    Length feet = Length.feet(1);
    Length inch = Length.inch(12);

    assertEquals(feet, inch);
  }

  @Test
  void shouldCalculateTheDifferenceOfTwoLengthsInInchAndCentimeter() {
    Length inch = Length.inch(2);
    Length centimeter = Length.centimeter(5);

    assertEquals(inch, centimeter);
  }

  @Test
  void shouldCalculateTheDifferenceOfTwoLengthsMillimeterAndCentimeter() {
    Length millimeter = Length.millimeter(10);
    Length centimeter = Length.centimeter(1);

    assertEquals(millimeter, centimeter);
  }
}
