package model;

import java.util.ArrayList;

public class BookingList
{

  private ArrayList<Booking> bookings;

  /**
   * No-argument Constructor initializing GuestList Array
   */
  public BookingList()
  {
    bookings = new ArrayList<Booking>();
  }

  /**
   *
   * @param booking
   */
  public void addBooking(Booking booking)
  {
    if (!(bookings.contains(booking)))
    {
    bookings.add(booking);
  }
  }

  public void removeBooking(Booking booking)
  {
    if (bookings.contains(booking))
    {
      bookings.remove(booking);
    }
  }


  }


