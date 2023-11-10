package com.tw.step9.shapes;

public class Square extends Rectangle {
  private Square(double side) {
    super(side, side);
  }

  public static Square create(double side) {
    return new Square(side);
  }
}
