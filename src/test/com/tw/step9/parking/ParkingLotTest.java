package com.tw.step9.parking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
  @Test
  void shouldAbleToParkACar() {
    ParkingLot parkingLot = ParkingLot.create(5, 5);
    Assertions.assertTrue(parkingLot.park());
  }

  @Test
  void shouldNotBeAbleToParkACarIfLotIsFull() {
    ParkingLot parkingLot = ParkingLot.create(1, 1);
    parkingLot.park();
    Assertions.assertFalse(parkingLot.park());
  }

  @Test
  void shouldAbleToKnowWhenTheLotIsFull() {
    ParkingLot parkingLot = ParkingLot.create(5, 5);
    Assertions.assertFalse(parkingLot.isFull());
  }
}
