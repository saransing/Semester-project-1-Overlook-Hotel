package model;
import utils.MyFileHandler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class HotelModelManager
{
  private static int bookingId = 1;
  private String guestListFile;
  private String bookingListFile;
  private String roomListFile;

  /**
   * Constructor initializing the Hotel Model Manager
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
   * @return object with list of all bookings
   */
  public BookingList getAllBookings()
  {
    BookingList allBookings = new BookingList();

    try
    {
      allBookings = (BookingList)MyFileHandler.readFromBinaryFile(bookingListFile);
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
   * Method to create an object of room list array list
   * @return object with list of all rooms
   */
  public RoomList getAllRooms()
  {
    RoomList allRooms = new RoomList();

    try
    {
      allRooms = (RoomList) MyFileHandler.readFromBinaryFile(roomListFile);
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
    return allRooms;
  }

  /**
   * Method to create an object of guest list array list
   * @return object with list of all guests
   */
  public GuestList getAllGuests()
  {
    GuestList allGuests = new GuestList();

    try
    {
      allGuests = (GuestList)MyFileHandler.readFromBinaryFile(guestListFile);
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
    return allGuests;
  }

  /**
   * Method to search a booking by phone number
   * @param phoneNumber takes phone number
   * @return list of bookings filterd by phone number
   */
  public BookingList searchBookingByPhoneNumber(long phoneNumber)
  {
    BookingList filteredBookings = new BookingList();
    BookingList allBookings = getAllBookings();

    for (int i = 0; i < allBookings.size(); i++)
    {
      if (allBookings.getBookingByIndex(i).getGuests().getMainGuest().getPhoneNumber() == phoneNumber)
      {
        filteredBookings.addBooking(allBookings.getBookingByIndex(i));
      }
    }
    return filteredBookings;
  }

  /**
   * Method to save all Bookings in a Binary file
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

  /**
   * Method to delete a booking object from BookingList
   * @param booking Booking object to be removed
   */

  public void removeBooking(Booking booking)
  {
    BookingList allBooking = getAllBookings();

    allBooking.removeBooking(booking);
    saveBookings(allBooking);
  }


  public void removeBookingByID(int bookingID)
  {
    BookingList allBooking = getAllBookings();

    for (int i = 0; i < allBooking.size(); i++)
    {
      if (allBooking.getBookingByIndex(i).getBookingID() == bookingID)
      {
        allBooking.removeBooking(allBooking.getBookingByIndex(i));
        break;
      }
    }
    saveBookings(allBooking);
  }

  public BookingList getArrivalsByDate(MyDate date)
  {
    BookingList arrivalsByDate = new BookingList();
    BookingList allBookings = getAllBookings();

    for (int i = 0; i < allBookings.size(); i++)
    {
      if(allBookings.getBookingByIndex(i).getArrivalDate().equals(date))
      {
        arrivalsByDate.addBooking(allBookings.getBookingByIndex(i));
      }
    }
    return arrivalsByDate;
  }

  public BookingList getDeparturesByDate(MyDate date)
  {
    BookingList departuresByDate = new BookingList();
    BookingList allBookings = getAllBookings();

    for (int i = 0; i < allBookings.size(); i++)
    {
      if(allBookings.getBookingByIndex(i).getDepartureDate().equals(date))
      {
        departuresByDate.addBooking(allBookings.getBookingByIndex(i));
      }
    }
    return departuresByDate;
  }

  public BookingList getTodaysArrivals()
  {
    LocalDate currentDate = LocalDate.now();

    return getArrivalsByDate(new MyDate(currentDate.getDayOfMonth(),currentDate.getMonthValue(),currentDate.getYear()));
  }

  public BookingList getTodaysDepartures()
  {
    LocalDate currentDate = LocalDate.now();
    return getDeparturesByDate(new MyDate(currentDate.getDayOfMonth(),currentDate.getMonthValue(),currentDate.getYear()));
  }

  public RoomList getAvailableRooms(MyDate arrivalDate2, MyDate departureDate2)
  {
    BookingList allBookings = getAllBookings();
    RoomList availableRooms = getAllRooms();
    for (int i = 0; i < allBookings.size(); i++)
    {
      if ((allBookings.getBookingByIndex(i).getArrivalDate().isBefore(departureDate2) ||
            (allBookings.getBookingByIndex(i).getArrivalDate().equals(departureDate2)))
          &&
          (allBookings.getBookingByIndex(i).getDepartureDate().isAfter(arrivalDate2) ||
              (allBookings.getBookingByIndex(i).getArrivalDate().equals(arrivalDate2))))
      {
        availableRooms.removeRoom(allBookings.getBookingByIndex(i).getRoom());
      }
    }
    return availableRooms;
  }

  //doesnt make sense
  public boolean doDatesOverlap(MyDate arrivalDate1, MyDate departureDate1, MyDate arrivalDate2, MyDate departureDate2)
  {
    BookingList allBookings = getAllBookings();
    RoomList availableRooms = getAllRooms();
    for (int i = 0; i < allBookings.size(); i++)
    {
      if (allBookings.getBookingByIndex(i).getArrivalDate().isBefore(departureDate2) &&
      allBookings.getBookingByIndex(i).getDepartureDate().isAfter(arrivalDate2))
      {
        availableRooms.removeRoom(allBookings.getBookingByIndex(i).getRoom());
        return true;
      }
    }
    return false;

  }

  public void addBooking(MyDate arrivalDate, MyDate departureDate, Guest guest, Room room)
  {
    BookingList allBookings = getAllBookings();
    GuestList newGuestList = new GuestList();
    newGuestList.addGuest(guest);

    RoomList availableRooms = getAvailableRooms(arrivalDate, departureDate);
    if (availableRooms.contains(room))
    {
      allBookings.addBooking(
          new Booking(arrivalDate, departureDate, newGuestList, room, bookingId));
      bookingId += 1;
    }
  }


}
