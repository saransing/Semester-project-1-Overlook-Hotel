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
  private  int numberOfBeds;
  private boolean status;
  private double roomPrice;

  /**
   * Constructor initializing the Room class variables
   * @param roomType initializing roomType variable
   * @param roomNumber initializing roomNumber variable
   * @param status initializing status variable
   * @param roomPrice initializing roomPrice variable
   */


  public Room(String roomType,int roomNumber,int NumberOfBeds,boolean status,double roomPrice )
  {
    this.roomType = roomType;
    this.roomNumber = roomNumber;
    this.numberOfBeds = numberOfBeds;
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
   * Get Number of beds
   * @return number of beds
   */


  public int getNumberOfBeds()
  {
    return numberOfBeds;
  }



  public boolean IsAvailable()
  {

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
   * Sets Number of Beds in a Room
   * @param numberOfBeds takes Number of Beds in a Room
   */
  public void setNumberOfBeds(int numberOfBeds)
  {
    this.numberOfBeds = numberOfBeds;
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
     return roomType == other.roomType&&
         roomNumber==other.roomNumber&&
         numberOfBeds ==other.numberOfBeds&&
         status == other.status&&
         roomPrice == other.roomPrice;

   }
  /**
   * toString method to return values as string
   * @return a string containig information about all room objects
   */
  @Override public String toString()
  {
    return "Room{" + "roomType='" + roomType + '\'' + ", roomNumber="
        + roomNumber + ", numberOfBeds=" + numberOfBeds + ", status=" + status
        + ", roomPrice=" + roomPrice + '}';
  }
}




