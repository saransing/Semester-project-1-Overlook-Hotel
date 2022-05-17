package model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Run
{
  public static void main(String[] args) throws FileNotFoundException
  {
    GuestList guestList = new GuestList();
    Guest guest1 = new Guest("Filip", "Arapovic", 063245657, "Croatian", new Address(10, "Norregade", "Horsens", 8700, "Denmark"), new MyDate(8,10,2001));
    Guest guest2 = new Guest("Darko", "Goluza", 063245657, "Croatian", new Address(10, "Norregade", "Horsens", 8700, "Denmark"), new MyDate(8,10,2001));
    guestList.addGuest(guest1);
    guestList.addGuest(guest2);

    Booking booking = new Booking(new MyDate(13,5,2022), new MyDate(16,5,2022), guestList, new Room("double bed", 14, 2, true, 400), 1);

    Booking booking2 = new Booking(new MyDate(14,5,2022), new MyDate(17,5,2022), guestList, new Room("double bed", 14, 2, true, 400), 2);

    Booking booking3 = new Booking(new MyDate(15,5,2022), new MyDate(18,5,2022), guestList, new Room("double bed", 14, 2, true, 400), 0);


    BookingList bookingList = new BookingList();
    bookingList.addBooking(booking);
    bookingList.addBooking(booking2);
    bookingList.addBooking(booking3);

    System.out.println(booking.toXML());

    FileOutputStream fileOut = new FileOutputStream("C:\\Users\\filip\\Desktop\\Faks\\Alah\\Sep\\Website\\Xml\\Xml.xml");
    PrintWriter write = new PrintWriter(fileOut);
    write.println(bookingList.toXMLArray());
    write.close();
  }
}
