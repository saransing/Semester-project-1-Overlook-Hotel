package model;
/**
 *A class containing Room variables and methods needed for booking
 * @author Filip
 * @version 1.0
 */


public class Booking
{
  private Date arrivalDate;
  private Date departureDate;
  private GuestList guests;
  private Room room;
  private int bookingID;

  /**
   * Constructor initializing the Booking class variables
   * @param arrivalDate initializing arrivalDate variable
   * @param departureDate initializing departureDate variable
   * @param guests initializing guests variable
   * @param room initializing room variable
   * @param bookingID initializing bookingID variable
   */

  public Booking(Date arrivalDate,Date departureDate,GuestList guests,Room room,int bookingID)
  {
    this.arrivalDate = arrivalDate;
    this.departureDate = departureDate;
    this.guests = guests;
    this.room = room;
    this.bookingID = bookingID;
  }


  /**
   * Get Arrival Date of Booking
   *
   * @return arrival date
   */


  public Date getArrivalDate()
  {
    return arrivalDate;
  }


  /**
   * Get Departure Date of Booking
   *
   * @return departure date
   */
  public Date getDepartureDate()
  {
    return departureDate;
  }

  /**
   * Get Number of Guests of Booking
   *
   * @return guest number
   */

  public GuestList getGuests()
  {
    return guests;
  }

  /**
   * Get Room of the Booking
   *
   * @return room
   */


  public Room getRoom()
  {
    return room;
  }

  /**
   * Get Booking ID of the booking
   *
   * @return booking ID
   */


  public int getBookingID()
  {
    return bookingID;
  }

  /**
   * Sets Arrival Date for Booking
   *
   * @param arrivalDate takes date of arrival in the Booking
   */

  public void setArrivalDate(Date arrivalDate)
  {
    this.arrivalDate = arrivalDate;
  }

  /**
   * Sets Departure Date for Booking
   *
   * @param departureDate takes date of departure in the Booking
   */

  public void setDepartureDate(Date departureDate)
  {
    this.departureDate = departureDate;
  }


  /**
   * Sets the number of guests in the booking
   *
   * @param guests takes number of guests in the Booking
   */


  public void setGuests(GuestList guests)
  {
    this.guests = guests;
  }
}
