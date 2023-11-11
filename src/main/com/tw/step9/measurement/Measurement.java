package com.tw.step9.measurement;

import java.util.Objects;

public class Measurement implements Comparable<Measurement> {
  private final double standardValue;

  private Measurement(double value) {
    this.standardValue = value;
  }

  public static Measurement inch(double value) {
    // TODO: 11/11/23 add validation checks
    return new Measurement(value);
  }

  private static double standardize(double value, LengthUnits unit) {
    return value * unit.conversionFactor;
  }

  public static Measurement feet(double value) {
    return Measurement.inch(standardize(value, LengthUnits.FEET));
  }

  public static Measurement centimeter(double value) {
    return Measurement.inch(standardize(value, LengthUnits.CM));
  }

  public static Measurement millimeter(int value) {
    return Measurement.inch(standardize(value, LengthUnits.MM));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Measurement length = (Measurement) o;
    return Double.compare(this.standardValue, length.standardValue) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.standardValue);
  }

  @Override
  public String toString() {
    return "Length{" +
        "inchValue=" + this.standardValue +
        '}';
  }

  @Override
  public int compareTo(Measurement other) {
    return (int) (this.standardValue - other.standardValue);
  }
}
