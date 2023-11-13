package com.tw.step9.measurement;

public enum LengthUnit implements Unit {
  FEET(12),
  CM(0.4),
  MM(0.04),
  INCH(1);

  public final double conversionFactor;

  LengthUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  @Override
  public double standardize(double value) {
    return value * this.conversionFactor;
  }

  @Override
  public Unit standardUnit() {
    return INCH;
  }
}
