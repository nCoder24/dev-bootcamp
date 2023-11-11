package com.tw.step9.measurement;

// TODO: 11/11/23 extract type to separate enum
public enum Units {
  FEET(12, "Length"),
  CM(0.4, "Length"),
  MM(0.04, "Length"),
  INCH(1, "Length"),
  GALLON(3.78, "Volume"),
  LITER(1, "Volume");

  public final double conversionFactor;
  public final String type;

  Units(double conversionFactor, String type) {
    this.conversionFactor = conversionFactor;
    this.type = type;
  }
}
