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

  // Return how many Student objects are in the list
  public int size()
  {
    return bookings.size();
  }

  // Get the Student object with the given firstName and lastName
  // if one exists, else return null
  public Booking getBookingByIndex(int index)
  {
    return bookings.get(index);
  }

  //toString method to print booking list as string
  public String toString()
  {
    String returnStr = "";

    for(int i = 0; i<bookings.size(); i++)
    {
      Booking temp = bookings.get(i);

      returnStr += temp +"\n";
    }
    return returnStr;
  }

  public ArrayList<String> toXMLArray()
  {
    ArrayList<String> xmlArray = new ArrayList<>();
    for (int i = 0; i < bookings.size(); i++)
    {
      xmlArray.add(bookings.get(i).toXML());
    }
    return xmlArray;
  }

}