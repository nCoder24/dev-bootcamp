package com.tw.step9.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
  @Test
  void shouldAbleToParkACar() {
    ParkingLot parkingLot = new ParkingLot(5);
    assertTrue(parkingLot.park());
  }

  @Test
  void shouldNotBeAbleToParkACarIfLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(1);
    parkingLot.park();
    assertFalse(parkingLot.park());
  }

  @Test
  void shouldAbleToKnowWhenTheLotIsFull() {
    ParkingLot parkingLot = new ParkingLot(5);
    assertFalse(parkingLot.isFull());
  }

  @Test
  void shouldAbleKnowIfParkingLotIsAvailable() {
    assertTrue(new ParkingLot(1).isAvailable());
    assertFalse(new ParkingLot(0).isAvailable());
  }
}
