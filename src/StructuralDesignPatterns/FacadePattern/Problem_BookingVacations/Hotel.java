package StructuralDesignPatterns.FacadePattern.Problem_BookingVacations;

import java.time.LocalDate;

public class Hotel {

  public void book(LocalDate checkinDate, LocalDate checkoutDate) {
    System.out.println("Booking hotel for " + checkinDate + " to " + checkoutDate);
  }

}
