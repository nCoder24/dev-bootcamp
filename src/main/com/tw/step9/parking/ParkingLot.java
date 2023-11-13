package com.tw.step9.parking;

import java.util.function.BiConsumer;

public class ParkingLot {
  private final int totalSlots;
  private final int id;
  private int availableSlots;
  private BiConsumer<Integer, Boolean> onParkListener;

  ParkingLot(int id, int capacity) {
    this.id = id;
    this.totalSlots = capacity;
    this.availableSlots = capacity;
  }

  public boolean park() {
    if (this.isFull()) return false;
    this.availableSlots--;

    if (this.onParkListener != null) {
      this.onParkListener.accept(this.availableSlots, this.isFull());
    }
    return true;
  }

  public boolean isFull() {
    return this.availableSlots == 0;
  }

  public boolean isAvailable() {
    return !this.isFull();
  }

  public void onPark(BiConsumer<Integer, Boolean> listener) {
    this.onParkListener = listener;
  }

  public int getID() {
    return this.id;
  }
}
