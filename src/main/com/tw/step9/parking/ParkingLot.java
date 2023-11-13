package com.tw.step9.parking;

public class ParkingLot {
  private final int totalSlots;
  private int availableSlots;

  private ParkingLot(int totalSlots, int availableSlots) {
    this.totalSlots = totalSlots;
    this.availableSlots = availableSlots;
  }

  public static ParkingLot create(int totalSlots) throws InvalidSizeException {
    if (totalSlots <= 0) throw new InvalidSizeException();
    return new ParkingLot(totalSlots, totalSlots);
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
