package com.tw.step9.chance;

public class Chance {

  private final double probability;

  private Chance(double probability) {
    this.probability = probability;
  }

  private static double calculateProbability(double percentage) {
    return percentage / 100;
  }

  private static double calculatePercentage(double probability) {
    return probability * 100;
  }

  public static Chance ofProbability(double probability) {
    return new Chance(probability);
  }

  public static Chance ofPercentage(double percentage) {
    return new Chance(calculateProbability(percentage));
  }

  public double percentage() {
    return calculatePercentage(this.probability);
  }

  public double probability() {
    return probability;
  }

  public Chance inverse() {
    return new Chance(1 - probability);
  }
}
