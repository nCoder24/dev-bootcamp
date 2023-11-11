package com.tw.step9.measurement;

import java.util.Objects;

public class Length {
  private final double inch;

  private Length(double inch) {
    this.inch = inch;
  }

  public static Length inch(double value) {
    // TODO: 11/11/23 add validation checks
    return new Length(value);
  }

  private static double standardize(double value, LengthUnits unit) {
    return value * unit.conversionFactor;
  }

  public static Length feet(double value) {
    return Length.inch(standardize(value, LengthUnits.FEET));
  }

  public static Length centimeter(double value) {
    return Length.inch(standardize(value, LengthUnits.CM));
  }

  public static Length millimeter(int value) {
    return Length.inch(standardize(value, LengthUnits.MM));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(this.inch, length.inch) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.inch);
  }

  @Override
  public String toString() {
    return "Length{" +
        "inchValue=" + this.inch +
        '}';
  }
}
