package com.tw.step9.parking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotAttendantTest {
  @Test
  void shouldBeAbleToParkACarInParkingLot() {
    ParkingLot parkingLot1 = new ParkingLot(1, 0);
    ParkingLot parkingLot2 = new ParkingLot(2, 1);

    ParkingLotAttendant parkingAttendant = new ParkingLotAttendant(parkingLot1, parkingLot2);
    Assertions.assertTrue(parkingAttendant.park());
    Assertions.assertFalse(parkingAttendant.park());
  }

  @Test
  void shouldBeAbleToAssignAnAssistantForTheAttendant() {
    ParkingLot parkingLot = new ParkingLot(1, 1);
    ParkingLotAttendant parkingAttendant = new ParkingLotAttendant(parkingLot);
    parkingAttendant.assign(new ParkingAssistant());

  }
}
