package com.tw.step9.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasurementTest {

  @Test
  void shouldCompareLengthsInInchAndFeet() {
    Measurement feet = Measurement.feet(1);
    Measurement inch = Measurement.inch(12);

    assertEquals(feet, inch);
  }

  @Test
  void shouldCompareLengthsInInchAndCentimeter() {
    Measurement inch = Measurement.inch(2);
    Measurement centimeter = Measurement.centimeter(5);

    assertEquals(inch, centimeter);
  }

  @Test
  void shouldCompareLengthsMillimeterAndCentimeter() {
    Measurement millimeter = Measurement.millimeter(10);
    Measurement centimeter = Measurement.centimeter(1);

    assertEquals(millimeter, centimeter);
  }
}
