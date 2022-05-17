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
   * Gets a Guest object with given phone number from the list
   * @param phoneNumber the phone number of the Guest object
   * @return the Guest object with the phone number if one exists, else null
   */
  public Guest searchForGuestByPhoneNumber(long phoneNumber)
  {
    for (int i = 0; i < guests.size(); i++)
    {
      if (guests.get(i).getPhoneNumber()==phoneNumber)
      {
        return guests.get(i);
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
      if (guests.get(i).getFirstName().equals(firstName) && guests.get(i).getLastName().equals(lastName))
      {
        return guests.get(i);
      }
    }
    return null;
  }
  public Guest getMainGuest()
  {
    return guests.get(0);
  }

  /**
   * Gets a String representation of the GuestList.
   * @return a String containing information about all Guest objects in the list - each Guest object followed by a new line character
   */
  public String toString()
  {
      return guests.toString();
  }

  /**
   * Gets how many Guest objects are in the list.
   * @return the number of Guest objects in the list
   */
  public int getNumberOfGuests()
  {
    return guests.size();
  }


}
