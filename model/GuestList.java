package model;
import java.util.ArrayList;

/**
 * A class containing a list of Guest objects****
 * @author Saranjeet Singh
 * @version 1.0
 */
public class GuestList
{
  private ArrayList<Guest> guests;

  /**
   * No-argument Constructor initializing GuestList Array
   */
  public GuestList()
  {
    guests = new ArrayList<Guest>();
  }

  /**
   * Adds a Guest to the list.
   * @param guest the guest to add to the list
   */
  public void addGuest(Guest guest)
  {
    guests.add(guest);
  }

  /**
   * Remove a Guest from the list.
   * @param guest the guest to remove from the list
   */
  public void removeGuest(Guest guest)
  {
    guests.remove(guest);
  }

  /**
   * Gets a Guest object with phone number from the list
   * @param phoneNumber the phone number of the Guest object
   * @return the Guest object with the phone number if one exists, else null
   */
  public Guest searchForGuestByPhoneNumber(int phoneNumber)
  {
    for (int i = 0; i < guests.size(); i++)
    {
      Guest temp = guests.get(i);

      if (temp.getPhoneNumber().equals(phoneNumber))
      {
        return temp;
      }
    }

    return null;
  }

  /**
   * Gets a Guest object with the given first name and last name from the list.
   * @param firstName the first name of the Guest object
   * @param lastName  the last name of the Guest object
   * @return the Guest object with the given first name and last name if one exists, else null
   */
  public Guest get(String firstName, String lastName)
  {
    for (int i = 0; i < guests.size(); i++)
    {
      Guest temp = guests.get(i);

      if (temp.getName().equals(firstName) && temp.getLastName().equals(lastName))
      {
        return temp;
      }
    }
    return null;
  }

  /**
   * Gets a String representation of the GuestList.
   * @return a String containing information about all Guest objects in the list - each Guest object followed by a new line character
   */
  public String toString()
  {
    {
      String returnStr = "";

      for (int i = 0; i < guests.size(); i++)
      {
        Guest temp = guests.get(i);

        returnStr += temp + "\n";
      }
      return returnStr;
    }

  }

  /**
   * Gets how many Guest objects are in the list.
   * @return the number of Guest objects in the list
   */
  public int numberOfGuests()
  {
    return guests.size();
  }

}
