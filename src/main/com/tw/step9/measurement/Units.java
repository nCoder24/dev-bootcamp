package com.tw.step9.measurement;

public enum Units {
  FEET(12, UnitTypes.LENGTH),
  CM(0.4, UnitTypes.LENGTH),
  MM(0.04, UnitTypes.LENGTH),
  INCH(1, UnitTypes.LENGTH),
  GALLON(3.78, UnitTypes.VOLUME),
  LITER(1, UnitTypes.VOLUME);

  public final double conversionFactor;
  public final UnitTypes type;

  Units(double conversionFactor, UnitTypes type) {
    this.conversionFactor = conversionFactor;
    this.type = type;
  }

  public double standardize(double value) {
    return value * this.conversionFactor;
  }
}
