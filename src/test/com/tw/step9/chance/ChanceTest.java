package com.tw.step9.chance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {
  @Test
  void shouldThrowExceptionIfCreatingChanceOfNegativeProbability() {
    assertThrows(InvalidRangeException.class, () -> Chance.create(-0.5));
  }

  @Test
  void shouldThrowExceptionIfCreatingChanceOfProbabilityGreaterThanOne() {
    assertThrows(InvalidRangeException.class, () -> Chance.create(1.5));
  }

  @Test
  void shouldGetTheInverseOfTheChance() throws InvalidRangeException {
    Chance chance = Chance.create(0.2);
    assertEquals(chance.inverse(), Chance.create(0.8));
  }
}