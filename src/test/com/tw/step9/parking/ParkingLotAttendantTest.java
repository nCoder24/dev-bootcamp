package com.tw.step9.parking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotAttendantTest {
  @Test
  void shouldBeAbleToParkACarInParkingLot() throws InvalidSizeException {
    ParkingLot parkingLot1 = ParkingLot.create(0);
    ParkingLot parkingLot2 = ParkingLot.create(1);

    ParkingLotAttendant parkingAttendant = new ParkingLotAttendant(parkingLot1, parkingLot2);
    Assertions.assertTrue(parkingAttendant.park());
    Assertions.assertFalse(parkingAttendant.park());
  }
}
