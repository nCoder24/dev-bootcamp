package com.tw.step9.shapes;

public class Rectangle implements TwoDimensionalShape {
  private final double width;
  private final double height;

  private Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public static Rectangle create(double width, double height) {
    return new Rectangle(width, height);
  }

  public static Rectangle create(double side) {
    return new Rectangle(side, side);
  }
  
  public boolean isSquare() {
    return this.height == this.width;
  }

  @Override
  public double area() {
    return this.width * this.height;
  }

  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }
}
