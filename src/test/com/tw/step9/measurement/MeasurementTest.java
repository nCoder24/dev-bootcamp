package com.tw.step9.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MeasurementTest {

  @Test
  void shouldCompareLengthsInInchAndFeet() {
    Measurement feet = Measurement.create(1, Units.FEET);
    Measurement inch = Measurement.create(12, Units.INCH);

    assertEquals(feet, inch);
  }

  @Test
  void shouldCompareLengthsInInchAndCentimeter() {
    Measurement inch = Measurement.create(2, Units.INCH);
    Measurement centimeter = Measurement.create(5, Units.CM);

    assertEquals(inch, centimeter);
  }

  @Test
  void shouldCompareLengthsMillimeterAndCentimeter() {
    Measurement millimeter = Measurement.create(10, Units.MM);
    Measurement centimeter = Measurement.create(1, Units.CM);

    assertEquals(millimeter, centimeter);
  }

  @Test
  void shouldCompareVolumesGallonAndLiter() {
    Measurement gallon = Measurement.create(1.0, Units.GALLON);
    Measurement liter = Measurement.create(3.78, Units.LITER);

    assertEquals(gallon, liter);
  }

  @Test
  void measurementsOfDifferentTypeOfUnitShouldNeverBeEqual() {
    Measurement gallon = Measurement.create(1.0, Units.LITER);
    Measurement inch = Measurement.create(1.0, Units.INCH);

    assertNotEquals(gallon, inch);
  }
}
