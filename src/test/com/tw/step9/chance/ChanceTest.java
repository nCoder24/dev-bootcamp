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
    assertEquals(chance.not(), Chance.create(0.8));
  }

  @Test
  void shouldGiveIntersectionOfTwoChances() throws InvalidRangeException {
    Chance chance = Chance.create(0.5);
    assertEquals(chance.and(Chance.create(0.5)), Chance.create(0.25));
  }

  @Test
  void shouldRepresentTheChanceOfNotGettingTailWhenFlippingOneCoin() throws InvalidRangeException {
    Chance chanceOfGettingTail = Chance.create(0.5);
    assertEquals(chanceOfGettingTail.not(), Chance.create(0.5));
  }

  @Test
  void shouldRepresentTheChanceOfGettingTailsWhenFlippingTwoCoins() throws InvalidRangeException {
    Chance chanceOfGettingTail = Chance.create(0.5);
    Chance chanceOfGettingBothTails = chanceOfGettingTail.and(chanceOfGettingTail);

    assertEquals(chanceOfGettingBothTails, Chance.create(0.25));
  }

  @Test
  void shouldRepresentTheChanceOfGettingAtLeastOneTailsWhenFlippingTwoCoins() throws InvalidRangeException {
    Chance chanceOfGettingTail = Chance.create(0.5);
    Chance chanceOfGettingAtLeastOneTails = chanceOfGettingTail.or(chanceOfGettingTail);

    assertEquals(chanceOfGettingAtLeastOneTails, Chance.create(0.75));
  }
}