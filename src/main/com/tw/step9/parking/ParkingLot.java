package com.tw.step9.parking;

public class ParkingLot {
  private final int totalSlots;
  private int availableSlots;

  ParkingLot(int capacity) {
    this.totalSlots = capacity;
    this.availableSlots = capacity;
  }

  public boolean park() {
    if (this.isFull()) return false;
    this.availableSlots--;
    return true;
  }

  public boolean isFull() {
    return this.availableSlots == 0;
  }


  public boolean isAvailable() {
    return !this.isFull();
  }
}
