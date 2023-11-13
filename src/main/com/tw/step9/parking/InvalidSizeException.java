package com.tw.step9.parking;

public class InvalidSizeException extends Throwable {
  public InvalidSizeException() {
    super("Parking lot cannot have negative total number of slots");
  }
}
