package com.tw.step9.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RectangleTest {
  @Test
  void shouldCalculateTheAreaForUnitDimensions() {
    Rectangle rectangle = Rectangle.create(1.0, 1.0);
    assertEquals(1.0, rectangle.area());
  }

  @Test
  void shouldCalculateTheArea() {
    Rectangle rectangle = Rectangle.create(2.0, 3.0);
    assertEquals(6.0, rectangle.area());
  }

  @Test
  void perimeterShouldBeDoubleOfNonZeroDimensionIfAnotherIsZero() {
    Rectangle rectangle = Rectangle.create(3.0, 0.0);
    assertEquals(6.0, rectangle.perimeter());
  }

  @Test
  void shouldCalculatePerimeterForNonZeroDimensions() {
    Rectangle rectangle = Rectangle.create(3, 4);
    assertEquals(14.0, rectangle.perimeter());
  }

  @Test
  void shouldBeASquareIfHeightAndWidthAreSame() {
    Rectangle rectangle = Rectangle.create(3, 3);
    assertTrue(rectangle.isSquare());
  }


  @Test
  void shouldBeASquareIfCreatedWithOnlyOneSide() {
    Rectangle rectangle = Rectangle.create(3);
    assertTrue(rectangle.isSquare());
  }
}
