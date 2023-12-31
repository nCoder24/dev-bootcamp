package com.tw.step9.measurement;

import java.util.Objects;

public class Measurement<U extends Unit> {
  private final double value;
  private final U unit;

  public Measurement(double value, U unit) {
    this.value = value;
    this.unit = unit;
  }

  private boolean hasSameStandardUnit(Measurement<? extends Unit> other) {
    return this.unit.standardUnit() == other.unit.standardUnit();
  }

  private boolean hasEqualValue(Measurement<? extends Unit> other) {
    return Math.abs(this.standardizeValue(this) - this.standardizeValue(other)) < 0.01;
  }

  private double standardizeValue(Measurement<? extends Unit> measurement) {
    return measurement.unit.standardize(measurement.value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Measurement<?> other = (Measurement<?>) o;
    return this.hasEqualValue(other) && this.hasSameStandardUnit(other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value, this.unit);
  }

  @Override
  public String toString() {
    return "Measurement{" +
        "value=" + this.value +
        ", unit=" + this.unit +
        ", standardValue=" + this.unit.standardize(this.value) +
        '}';
  }

  public Measurement<? extends Unit> add(Measurement<U> other) {
    double sum = this.standardizeValue(this) + this.standardizeValue(other);
    return new Measurement<>(sum, this.unit.standardUnit());
  }
}
