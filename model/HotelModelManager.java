package model;
import utils.MyFileHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class HotelModelManager
{
  private String guestListFile;
  private String bookingListFile;
  private String roomListFile;

  /**
   * Constructor initializing the Hotel Model Manager
   *
   * @param guestListFile   initializing Guest List File
   * @param bookingListFile initializing Booking List File
   * @param roomListFile    initializing Room List File
   */
  public HotelModelManager(String guestListFile, String bookingListFile, String roomListFile)
  {
    this.guestListFile = guestListFile;
    this.bookingListFile = bookingListFile;
    this.roomListFile = roomListFile;
  }

  /**
   * Method to create an object of booking list array list
   *
   * @return object with list of all bookings
   */
  public ArrayList<BookingList> getAllBookings()
  {
    ArrayList<BookingList> allBookings = new ArrayList<>();
    try
    {
      allBookings = MyFileHandler.readFromBinaryFile(
          bookingListFile);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return allBookings;
  }

  /**
   * Method to search a booking by phone number
   *
   * @param byNumber takes phone number
   * @return list of bookings filterd by phone number
   */
  public BookingList searchBookingByPhoneNumber(String byNumber)
  {
    BookingList searchBookingByPhoneNumber = new BookingList();
    ArrayList<BookingList> allBookings = getAllBookings();

    for (int i = 0; i < allBookings.size(); i++)
    {
      if (allBookings.get(i).getCountry().equals(byNumber))
      {
        searchBookingByPhoneNumber.add(allBookings.get(i));
      }
    }
    return searchBookingByPhoneNumber;
  }

  /**
   * Method to save all Bookings in a Binary file
   *
   * @param bookings takes booking data to be saved to Booking List file
   */
  public void saveBookings(BookingList bookings)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(bookingListFile, bookings);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Method to save all Rooms data in a Binary file
   *
   * @param rooms room data to be saved to Room List file
   */
  public void saveRoomsList(RoomList rooms)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(roomListFile, rooms);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  /**
   * Method to save all guests data in a Binary file
   *
   * @param guests room data to be saved to Guest List file
   */
  public void saveGuestList(GuestList guests)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(guestListFile, guests);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file");
    }
  }

  public void removeBookingByID(int bookingID)
  {
    BookingList allBooking = getAllBookings();

    for (int i = 0; i < allBooking.size(); i++)
    {

    }

  }
}