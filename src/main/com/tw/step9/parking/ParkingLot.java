package com.tw.step9.parking;

public class ParkingLot {
  private final int totalPlaces;
  private int carParked;

  private ParkingLot(int totalPlaces, int carParked) {
    this.totalPlaces = totalPlaces;
    this.carParked = carParked;
  }

  public static ParkingLot create(int width, int height) throws InvalidSizeException {
    if (width <= 0 || height <= 0) throw new InvalidSizeException();
    return new ParkingLot(width * height, 0);
  }

  public boolean park() {
    if (this.isFull()) return false;
    this.carParked++;
    return true;
  }

  public boolean isFull() {
    return this.totalPlaces == this.carParked;
  }
}
