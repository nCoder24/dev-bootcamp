package com.tw.step9.parking;

import java.util.Arrays;

public class ParkingAssistant {
  private final Display display;

  public ParkingAssistant() {
    this.display = new Display();
  }

  public void monitor(ParkingLot[] parkingLots) {
    Arrays.stream(parkingLots).forEach((ParkingLot parkingLot) -> {
      parkingLot.onPark((Integer availableSlots, Boolean isFull) -> {
        this.display.update(parkingLot.getID(), availableSlots, isFull);
      });
    });
  }
}
