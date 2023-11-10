package com.tw.step9.chance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChanceTest {
  @Test
  void shouldThrowExceptionIfCreatingChanceOfNegativeProbability() {
    assertThrows(InvalidRangeException.class, () -> Chance.createFromRatio(-0.5));
  }

  @Test
  void shouldThrowExceptionIfCreatingChanceOfProbabilityGreaterThanOne() {
    assertThrows(InvalidRangeException.class, () -> Chance.createFromRatio(1.5));
  }

  @Test
  void shouldGetTheInverseOfTheChance() throws InvalidRangeException {
    Chance chance = Chance.createFromRatio(0.2);
    assertEquals(chance.inverse(), Chance.createFromRatio(0.8));
  }
  
  @Test
  void shouldCreateChanceFromPossibleAndFavourableOutcomes() throws InvalidRangeException {
    Chance chance = Chance.createFromOutcomes(1, 2);
    assertEquals(chance, Chance.createFromRatio(0.5));
  }
}