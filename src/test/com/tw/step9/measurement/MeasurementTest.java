package com.tw.step9.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasurementTest {
  @Test
  void shouldCompareLengthsInInchAndFeet() {
    Measurement<LengthUnit> feet = new Measurement<>(1, LengthUnit.FEET);
    Measurement<LengthUnit> inch = new Measurement<>(12, LengthUnit.INCH);

    assertEquals(feet, inch);
  }

  @Test
  void shouldCompareLengthsInInchAndCentimeter() {
    Measurement<LengthUnit> inch = new Measurement<>(2, LengthUnit.INCH);
    Measurement<LengthUnit> centimeter = new Measurement<>(5, LengthUnit.CM);

    assertEquals(inch, centimeter);
  }

  @Test
  void shouldCompareLengthsMillimeterAndCentimeter() {
    Measurement<LengthUnit> millimeter = new Measurement<>(10, LengthUnit.MM);
    Measurement<LengthUnit> centimeter = new Measurement<>(1, LengthUnit.CM);

    assertEquals(millimeter, centimeter);
  }

  @Test
  void shouldCompareVolumesGallonAndLiter() {
    Measurement<VolumeUnit> gallon = new Measurement<>(1.0, VolumeUnit.GALLON);
    Measurement<VolumeUnit> liter = new Measurement<>(3.78, VolumeUnit.LITER);

    assertEquals(gallon, liter);
  }

  @Test
  void shouldAddTwoMeasurementsOfSameUnits() {
    Measurement<LengthUnit> inch1 = new Measurement<>(2.0, LengthUnit.INCH);
    Measurement<LengthUnit> inch2 = new Measurement<>(3.0, LengthUnit.INCH);

    assertEquals(new Measurement<>(5.0, LengthUnit.INCH), inch1.add(inch2));
  }

  @Test
  void shouldAddTwoMeasurementsDifferentUnitsOfSameTypes() {
    Measurement<LengthUnit> inch1 = new Measurement<>(2.0, LengthUnit.INCH);
    Measurement<LengthUnit> inch2 = new Measurement<>(2.5, LengthUnit.CM);

    assertEquals(new Measurement<>(3.0, LengthUnit.INCH), inch1.add(inch2));

    Measurement<VolumeUnit> gallon = new Measurement<>(1, VolumeUnit.GALLON);
    Measurement<VolumeUnit> liter = new Measurement<>(1, VolumeUnit.LITER);

    assertEquals(new Measurement<>(4.78, VolumeUnit.LITER), gallon.add(liter));
  }
}
