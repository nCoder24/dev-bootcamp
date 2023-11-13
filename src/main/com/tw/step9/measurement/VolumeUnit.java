package com.tw.step9.measurement;

public enum VolumeUnit implements Unit {
  GALLON(3.78),
  LITER(1);

  public final double conversionFactor;

  VolumeUnit(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  public double standardize(double value) {
    return value * this.conversionFactor;
  }

  @Override
  public Unit standardUnit() {
    return LITER;
  }
}
