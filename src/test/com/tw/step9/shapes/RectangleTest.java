package com.tw.step9.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
  @Test
  void shouldCalculateTheAreaForUnitDimensions() {
    Rectangle rectangle = new Rectangle(1.0, 1.0);
    double area = rectangle.area();
    Assertions.assertEquals(1.0, area);
  }

  @Test
  void shouldCalculateTheArea() {
    Rectangle rectangle = new Rectangle(2.0, 3.0);
    double area = rectangle.area();
    Assertions.assertEquals(6.0, area);
  }

}
