package com.tw.step9.measurement;

public interface Unit {
  double standardize(double value);

  Unit standardUnit();
}
