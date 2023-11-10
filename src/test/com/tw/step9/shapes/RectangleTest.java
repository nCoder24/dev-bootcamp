package com.tw.step9.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
  @Test
  void shouldCalculateTheAreaForUnitDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(1.0, 1.0);
    assertEquals(1.0, rectangle.area(), 0.0);
  }

  @Test
  void shouldCalculateTheArea() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(2.0, 3.0);
    assertEquals(6.0, rectangle.area(), 0.0);
  }

  @Test
  void perimeterShouldBeDoubleOfNonZeroDimensionIfAnotherIsZero() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(3.0, 0.0);
    assertEquals(6.0, rectangle.perimeter(), 0.0);
  }

  @Test
  void shouldCalculatePerimeterForNonZeroDimensions() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(3, 4);
    assertEquals(14.0, rectangle.perimeter(), 0.0);
  }

  @Test
  void shouldBeASquareIfHeightAndWidthAreSame() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(3, 3);
    assertTrue(rectangle.isSquare());
  }

  @Test
  void shouldBeASquareIfCreatedWithOnlyOneSide() throws InvalidDimensionException {
    Rectangle rectangle = Rectangle.create(3);
    assertTrue(rectangle.isSquare());
  }

  @Test
  void shouldThrowExceptionIfGivenNegativeDimension() {
    assertThrows(InvalidDimensionException.class, () -> Rectangle.create(-3, 1));
  }
}
