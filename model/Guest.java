package model;
/**
/**
 * A class containing guest variables and methods needed for booking
 * @author Saranjeet Singh
 * @version 1.0
 */
public class Guest
{
  private String firstName;
  private String lastName;
  private long phoneNumber;
  private String nationality;
  private Address address;
  private MyDate dateOfBirth;

  /**
   * Constructor initializing the Guest class variables
   * @param firstName initializing firstName variable
   * @param lastName initializing lastName variable
   * @param phoneNumber initializing phoneNumber variable
   * @param nationality initializing nationality variable
   * @param address initializing address variable
   * @param dateOfBirth initializing dateOfBirth variable
   */
  public Guest(String firstName,String lastName, long phoneNumber, String nationality, Address address, MyDate dateOfBirth)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.phoneNumber=phoneNumber;
    this.nationality=nationality;
    this.address=address;
    this.dateOfBirth=dateOfBirth.copy();
  }

  /**
   * Get first name of a guest
   * @return first name of a guest
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * Get last name of a guest
   * @return last name of a guest
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * Get phone number of a guest
   * @return Phone number of a guest
   */
  public long getPhoneNumber(){
    return phoneNumber;
  }

  /**
   * Get nationality of a guest
   * @return Nationality of a guest
   */
  public String getNationality(){
    return nationality;
  }

  /**
   * Get address of a guest
   * @return Address of a guest
   */
  public Address getAddress(){
    return address;
  }

  /**
   * Get date of birth of a guest
   * @return Date of birth of a guest
   */
  public MyDate getDateOfBirth(){  //do we need this method?
    return dateOfBirth.copy();
  }

  /**
   * Sets first of a guest
   * @param firstName takes firstName of a guest
   */
  public void setFirstName(String firstName)
  {
    this.firstName=firstName;
  }

  /**
   * Sets last name of a guest
   * @param lastName takes lastName of a guest
   */
  public void setLastName(String lastName)
  {
    this.lastName=lastName;
  }

  /**
   * Sets Phone number of a guest
   * @param phoneNumber takes phone number of a guest
   */
  public void setPhoneNumber(long phoneNumber)
  {
    this.phoneNumber=phoneNumber;
  }

  /**
   * Sets nationality of a guest
   * @param nationality takes nationality of a guest
   */
  public void setNationality(String nationality)
  {
    this.nationality=nationality;
  }

  /**
   * Sets address of a guest
   * @param address takes address of a guest
   */
  public void setAddress(Address address)
  {
    this.address=address;
  }

  /**
   * Sets date of birth of a guest
   * @param dateOfBirth takes date of birth of a guest
   */
  public void setDateOfBirth(MyDate dateOfBirth)
  {
    this.dateOfBirth=dateOfBirth.copy();
  }

  /**
   * Equals method to compare two guests
   * @param obj used to compare
   * @return true or false. If both guests match, returns true otherwise false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Guest))
    {
      return false;
    }
    Guest other = (Guest) obj;
    return firstName.equals(other.firstName)
        && lastName.equals(other.lastName)
        && phoneNumber==other.phoneNumber
        && nationality.equals(other.nationality)
        && address==other.address
        && dateOfBirth==other.dateOfBirth;
  }

  /**
   * Gets a String representation of the Guest class
   * @return a String containing information about all Guest objects
   */
  public String toString(){
    return "Name: "+firstName+" "+lastName+"\n"
        + "Phone number: "+phoneNumber+"\n"
        +"Nationality: "+nationality+"\n"
        +"Address: "+address+"\n"
        +"Date of birth: "+dateOfBirth;
  }


}
