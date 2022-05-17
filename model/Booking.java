package model;

import java.text.SimpleDateFormat;

/**
 *A class containing Room variables and methods needed for booking
 * @author Filip
 * @version 1.0
 */


public class Booking
{
  private MyDate arrivalDate;
  private MyDate departureDate;
  private GuestList guests;
  private Room room;
  private int bookingID;

  /**
   * Constructor initializing the Booking class variables
   *
   * @param arrivalDate   initializing arrivalDate variable
   * @param departureDate initializing departureDate variable
   * @param guests        initializing guests variable
   * @param room          initializing room variable
   * @param bookingID     initializing bookingID variable
   */

  public Booking(MyDate arrivalDate, MyDate departureDate, GuestList guests, Room room, int bookingID)
  {
    this.arrivalDate = arrivalDate;
    this.departureDate = departureDate;
    this.guests = guests;
    this.room = room;
    this.bookingID = bookingID;
  }

  /**
   * Get arrival date of a Booking
   * @return arrival date of a Booking
   */
  public MyDate getArrivalDate()
  {
    return arrivalDate;
  }

  /**
   * Get departure date of a Booking
   * @return departure date of a Booking
   */
  public MyDate getDepartureDate()
  {
    return departureDate;
  }

  /**
   * Get guests for a Booking
   * @return guest of a Booking
   */

  public GuestList getGuests()
  {
    return guests;
  }

  /**
   * Get room of a Booking
   * @return room of a Booking
   */
  public Room getRoom()
  {
    return room;
  }

  /**
   * Get Booking ID of the booking
   * @return booking ID of a Booking
   */
  public int getBookingID()
  {
    return bookingID;
  }

  /**
   * Sets Arrival Date for a Booking
   * @param arrivalDate takes date of arrival in the Booking
   */
  public void setArrivalDate(MyDate arrivalDate)
  {
    this.arrivalDate = arrivalDate;
  }

  /**
   * Sets Departure Date for a Booking
   * @param departureDate takes date of departure in a Booking
   */
  public void setDepartureDate(MyDate departureDate)
  {
    this.departureDate = departureDate;
  }

  /**
   * Sets the array of guests in a Booking
   * @param guests takes array of guests in a Booking
   */
  public void setGuests(GuestList guests)
  {
    this.guests = guests;
  }

  /**
   * Gets total duration of a Booking
   * @return total duration of a Booking
   */
  public int getBookingDuration()
  {
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    //   try {
    //     int count = 0;
    //     for(int i=0; i<365; i++){
    //       if(arrivalDate.equals(departureDate)){
    //         return count;
    //       }else{
    //         arrivalDate.;
    //         count++;
    //       }
    //     }
    //   }catch (ParseException e) {
    //     e.printStackTrace();
    //   }
    //   return -1;
    // }
    return 1;
  }
  public String toXML() {
    String XML = String.format("<booking>\n"
            + "\t<bookingID>%d</bookingID>\n"
            + "\t<arrivalDate>%s</arrivalDate>\n"
            + "\t<departureDate>%s</departureDate>\n"
            + "\t%s\n"
            + "</booking>",
        bookingID,arrivalDate.toString(), departureDate.toString(), room.toXML());

    return XML;
  }
}