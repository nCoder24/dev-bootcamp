package com.tw.step9.measurement;

import java.util.Objects;

public class Measurement<U extends Unit> {
  private final double value;
  private final U unit;

  public Measurement(double value, U unit) {
    this.value = value;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Measurement<?> other = (Measurement<?>) o;
    return this.hasEqualValue(other) && this.hasSameStandardUnit(other);
  }

  private boolean hasSameStandardUnit(Measurement<?> other) {
    return this.unit.standardUnit() == other.unit.standardUnit();
  }

  private boolean hasEqualValue(Measurement<?> other) {
    return Double.compare(this.unit.standardize(this.value), other.unit.standardize(other.value)) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value, this.unit);
  }

  @Override
  public String toString() {
    return "Length{" +
        "inchValue=" + this.value +
        '}';
  }
}
