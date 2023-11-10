package com.tw.step9.chance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {
  @Test
  void shouldGetThePercentageValueOfTheChance() {
    Chance chance = Chance.ofProbability(0.5);
    assertEquals(chance.percentage(), 50.0, 0.0);
  }

  @Test
  void shouldGetTheProbabilityValueOfTheChance() {
    Chance chance = Chance.ofPercentage(50);
    assertEquals(chance.probability(), 0.5, 0.0);
  }

  @Test
  void shouldGetTheInverseOfTheChance() {
    Chance chance = Chance.ofPercentage(20);
    assertEquals(chance.inverse().probability(), 0.8, 0.0);
  }
}