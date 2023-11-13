package com.tw.step9.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
  @Test
  void shouldAbleToParkACar() throws InvalidSizeException {
    ParkingLot parkingLot = ParkingLot.create(5);
    assertTrue(parkingLot.park());
  }

  @Test
  void parkingLotCannotBeCreatedForInvalidSize() throws InvalidSizeException {
    assertThrows(InvalidSizeException.class, () -> ParkingLot.create(-5));
  }

  @Test
  void shouldNotBeAbleToParkACarIfLotIsFull() throws InvalidSizeException {
    ParkingLot parkingLot = ParkingLot.create(1);
    parkingLot.park();
    assertFalse(parkingLot.park());
  }

  @Test
  void shouldAbleToKnowWhenTheLotIsFull() throws InvalidSizeException {
    ParkingLot parkingLot = ParkingLot.create(5);
    assertFalse(parkingLot.isFull());
  }
}
