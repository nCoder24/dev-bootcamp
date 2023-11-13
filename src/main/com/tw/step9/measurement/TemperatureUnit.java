package com.tw.step9.measurement;

import java.util.function.Function;

public enum TemperatureUnit implements Unit {
  C(value -> value + 273.15),
  F(value -> (value - 32) * 5 / 9 + 273.15),
  KELVIN(value -> value);

  private final Function<Double, Double> standardizer;

  TemperatureUnit(Function<Double, Double> standardizer) {
    this.standardizer = standardizer;
  }

  @Override
  public double standardize(double value) {
    return this.standardizer.apply(value);
  }

  @Override
  public Unit standardUnit() {
    return KELVIN;
  }
}
