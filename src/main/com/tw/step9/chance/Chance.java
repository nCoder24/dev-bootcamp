package com.tw.step9.chance;

import java.util.Objects;

public class Chance {

  private final double probability;

  private Chance(double probability) {
    this.probability = probability;
  }

  public static Chance create(double ratio) throws InvalidRangeException {
    if (ratio < 0 || ratio > 1) throw new InvalidRangeException("Range is not valid");
    return new Chance(ratio);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Chance chance = (Chance) o;
    return Double.compare(this.probability, chance.probability) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.probability);
  }

  public Chance not() throws InvalidRangeException {
    return Chance.create(1 - this.probability);
  }

  public Chance and(Chance other) throws InvalidRangeException {
    return Chance.create(this.probability * other.probability);
  }
}
