package com.tw.step9.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
  @Test
  void shouldCalculateTheAreaForUnitDimensions() {
    Rectangle rectangle = new Rectangle(1.0, 1.0);
    double area = rectangle.area();
    assertEquals(1.0, area);
  }

  @Test
  void shouldCalculateTheArea() {
    Rectangle rectangle = new Rectangle(2.0, 3.0);
    double area = rectangle.area();
    assertEquals(6.0, area);
  }

  @Test
  void perimeterShouldBeDoubleOfNonZeroDimensionIfAnotherIsZero() {
    Rectangle rectangle = new Rectangle(3.0, 0.0);
    double perimeter = rectangle.perimeter();
    assertEquals(6.0, perimeter);
  }

  @Test
  void shouldCalculatePerimeterForNonZeroDimensions() {
    Rectangle rectangle = new Rectangle(3, 4);
    double perimeter = rectangle.perimeter();
    assertEquals(14.0, perimeter);
  }
}
