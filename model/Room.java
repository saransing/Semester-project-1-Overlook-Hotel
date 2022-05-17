package model;

import java.util.Objects;

/**
 *A class containing Room variables and methods needed for booking
 * @author Filip
 * @version 1.0
 */

public class Room
{
  private String roomType;
  private int roomNumber;
  private boolean status;
  private double roomPrice;

  /**
   * Constructor initializing the Room class variables
   * @param roomType initializing roomType variable
   * @param roomNumber initializing roomNumber variable
   * @param status initializing status variable
   * @param roomPrice initializing roomPrice variable
   */
  public Room(String roomType,int roomNumber,boolean status,double roomPrice )
  {
    this.roomType = roomType;
    this.roomNumber = roomNumber;
    this.status = status;
    this.roomPrice = roomPrice;
  }

  /**
   * Get Room Type
   * @return room type
   */
  public String getRoomType()
  {
    return roomType;
  }



  /**
   * Get Room Number
   * @return room number
   */

  public int getRoomNumber()
  {
    return roomNumber;
  }

  /**
   *
   * @return
   */
  public boolean IsAvailable()
  {
    return status;
  }

  /**
   * Get Room Price
   * @return Room Price
   */
  public double getRoomPrice()
  {
    return roomPrice;
  }


  /**
   * Sets Room Type of a Room
   * @param roomType takes room type of a Room
   */
  public void setRoomType(String roomType)
  {
    this.roomType = roomType;
  }

  /**
   * Sets Room Number in a Room
   * @param roomNumber takes room number of Room
   */
  public void setRoomNumber(int roomNumber)
  {
    this.roomNumber = roomNumber;
  }

  /**
   * Sets Status of a Room
   * @param status takes Status of a Room
   */
  public void setStatus(boolean status)
  {
    this.status = status;
  }

  /**
   * Sets Room Price
   * @param roomPrice takes Room Price
   */
  public void setRoomPrice(double roomPrice)
  {
    this.roomPrice = roomPrice;
  }

  /**
   * Equals method to compare
   * @param obj used to compare
   * @return If both guests math returns true, otherwise returns false.
   */
   public boolean equals(Object obj)
   {
     if(!(obj instanceof Room ))
     {
       return  false;
     }

     Room other = (Room)obj;
     return roomType.equals(other.roomType)&&
         roomNumber==other.roomNumber&&
         status == other.status&&
         roomPrice == other.roomPrice;
   }

  /**
   * toString method to return values as string
   * @return a string containing information about all room objects
   */
  public String toString()
  {
    return "Room{" + "roomType='" + roomType + ", roomNumber="
        + roomNumber +  ", status=" + status
        + ", roomPrice=" + roomPrice + '}';
  }


  public Object toXML()
  {
    String XML = String.format("<room>\n"
            + "\t<roomType>%s</roomType>\n"
            + "\t<roomNumber>%d</roomNumber>\n"
            + "\t<roomPrice>%f</roomPrice>\n"
            + "</room>",
        roomType,roomNumber,roomPrice);

    return XML;
  }
}




