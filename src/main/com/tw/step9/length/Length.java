package com.tw.step9.length;

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

  public static Length feet(double value) {
    return Length.inch(value * 12);
  }

  public static Length centimeter(double value) {
    return Length.inch(value / 2.5);
  }

  public static Length millimeter(int value) {
    return Length.centimeter((double) value / 10);
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
