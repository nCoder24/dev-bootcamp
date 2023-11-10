package com.tw.step9.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
  @Test
  void areaShouldBeZeroIfSideIsZero() {
    Square square = new Square(0.0);
    double area = square.area();
    assertEquals(0.0, area);
  }

  @Test
  void shouldCalculateAreaForNonZeroSide() {
    Square square = new Square(2.0);
    double area = square.area();
    assertEquals(4.0, area);
  }

  @Test
  void shouldCalculateAreaForNonZero() {
    Square square = new Square(2.0);
    double perimeter = square.perimeter();
    assertEquals(8.0, perimeter);
  }
}
