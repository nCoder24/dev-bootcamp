package com.tw.step9.measurement;

import java.util.Objects;

public class Measurement implements Comparable<Measurement> {
  private final double standardValue;
  private final Units unit;

  private Measurement(double standardValue, Units unit) {
    this.standardValue = standardValue;
    this.unit = unit;
  }

  public static Measurement create(double value, Units unit) {
    // TODO: 11/11/23 add validation checks
    return new Measurement(unit.standardize(value), unit);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Measurement measurement = (Measurement) o;
    if (!this.unit.type.equals(measurement.unit.type)) return false;
    return Double.compare(this.standardValue, measurement.standardValue) == 0;
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
