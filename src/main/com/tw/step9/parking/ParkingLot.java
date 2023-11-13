package com.tw.step9.parking;

public class ParkingLot {
  private int availableSlots;

  private ParkingLot(int availableSlots) {
    this.availableSlots = availableSlots;
  }

  public static ParkingLot create(int width, int height) throws InvalidSizeException {
    if (width <= 0 || height <= 0) throw new InvalidSizeException();
    return new ParkingLot(width * height);
  }

  public boolean park() {
    if (this.isFull()) return false;
    this.availableSlots--;
    return true;
  }

  public boolean isFull() {
    return this.availableSlots == 0;
  }
}
