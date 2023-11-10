package com.tw.step9.shapes;

public class Rectangle {
  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return this.width * this.height;
  }

  public double perimeter() {
    return 2 * (this.width + this.height);
  }
}
