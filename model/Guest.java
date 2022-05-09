package model;

/**
 * A class containing guest variables and methods needed for reservations
 * @author Saranjeet Singh
 * @version 1.0
 */
public class Guest
{
  private String firstName;
  private String lastName;
  private int phoneNumber;
  private String nationality;
  private Address address;
  private Date dateOfBirth;

  /**
   * Constructor initializing the Guest class variables
   * @param firstName initializing firstName variable
   * @param lastName initializing lastName variable
   * @param phoneNumber initializing phoneNumber variable
   * @param nationality initializing nationality variable
   * @param address initializing address variable
   * @param dateOfBirth initializing dateOfBirth variable
   */
  public Guest(String firstName,String lastName, int phoneNumber, String nationality, Address address, Date dateOfBirth)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.phoneNumber=phoneNumber;
    this.nationality=nationality;
    this.address=address;
    this.dateOfBirth=dateOfBirth;
  }

  /**
   * Get first and last name of guest
   *
   * @return firstName and lastName of guest
   */
  public String getName(){
    return firstName+" "+lastName;
  }

  /**
   * Get phone number of guest
   *
   * @return phoneNumber of guest
   */
  public int getPhoneNumber(){
    return phoneNumber;
  }

  /**
   * Get nationality of guest
   *
   * @return nationality of guest
   */
  public String getNationality(){
    return nationality;
  }

  /**
   * Get address of guest
   *
   * @return address of guest
   */
  public Address getAddress(){
    return address;
  }

  /**
   * Get date of birth of guest
   *
   * @return dateOfBirth of guest
   */
  public Date getDateOfBirth(){  //do we need this method?
    return dateOfBirth;
  }

  /**
   * Sets first and last name of guest
   *
   * @param firstName takes firstName of guest
   * @param lastName takes lastName of guest
   */
  public void setName(String firstName, String lastName){
  }

  /**
   * Sets phone Number of guest
   *
   * @param phoneNumber takes phone number of guest
   */
  public void setPhoneNumber(int phoneNumber){
  }

  /**
   * Sets nationality of guest
   *
   * @param nationality takes nationality of guest
   */
  public void setNationality(String nationality){
  }

  /**
   * Sets address of guest
   *
   * @param address takes address of guest
   */
  public void setAddress(Address address) {
  }

  /**
   * Sets date of birth of guest
   *
   * @param dateOfBirth takes date of birth of guest
   */
  public void setDateOfBirth(Date dateOfBirth){
  }

  /**
   * Equals method to compare two guests
   *
   * @param obj used to compare
   * @return If both guests math returns true, otherwise returns false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Guest))
    {
      return false;
    }
    Guest other = (Guest) obj;
    return firstName == other.firstName
        && lastName == other.lastName
        && phoneNumber==other.phoneNumber
        && nationality==other.nationality
        && address==other.address
        && dateOfBirth==other.dateOfBirth;
  }

  /**
   * toString method to return values as string
   *
   * @return returns following in string format: First and last name, Phone number, Nationality, Address & Date of birth of guest
   */
  public String toString(){
    return "Name: "+firstName+" "+lastName+"\n"
        + "Phone number: "+phoneNumber+"\n"
        +"Nationality: "+nationality+"\n"
        +"Address: "+address+"\n"
        +"Date of birth: "+dateOfBirth;
  }

}
