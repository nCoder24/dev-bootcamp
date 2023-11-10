package com.tw.step9.shapes;

public class Square implements TwoDimensionalShape{

  private final double side;

  private Square(double side) {
    this.side = side;
  }

  public static Square create(double side) {
    return new Square(side);
  }

  @Override
  public double area() {
    return this.side * this.side;
  }
  @Override
  public double perimeter() {
    return 4 * this.side;
  }
}
