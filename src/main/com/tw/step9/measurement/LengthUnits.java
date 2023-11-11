package com.tw.step9.measurement;

public enum LengthUnits {
  FEET(12),
  CM(0.4),
  MM(0.04);

  public final double conversionFactor;

  LengthUnits(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }
}
