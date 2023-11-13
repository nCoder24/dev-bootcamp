package com.tw.step9.parking;

import java.util.Arrays;
import java.util.Optional;

public class ParkingLotAttendant {
  private final ParkingLot[] parkingLots;

  public ParkingLotAttendant(ParkingLot... parkingLots) {
    this.parkingLots = parkingLots;
  }

  public boolean park() {
    Optional<ParkingLot> availableParkingLot = Arrays.stream(this.parkingLots).filter(ParkingLot::isAvailable).findFirst();

    if (availableParkingLot.isPresent()) {
      availableParkingLot.get().park();
      return true;
    }

    return false;
  }

  public void assign(ParkingAssistant assistant) {
    assistant.monitor(this.parkingLots);
  }
}
