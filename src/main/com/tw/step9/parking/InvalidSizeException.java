package com.tw.step9.parking;

public class InvalidSizeException extends Throwable {
  public InvalidSizeException() {
    super("Parking lot dimension cannot be negative or zero");
  }
}
