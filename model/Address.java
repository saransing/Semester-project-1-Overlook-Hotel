package model;

/**
 * A class containing Address variables
 * @author Saranjeet Singh
 * @version 1.0
 */
public class Address
{
  private int houseNumber;
  private String streetName;
  private String city;
  private int postalCode;
  private String country;

  /**
   * Constructor initializing the Address class variables
   * @param houseNumber initializing House Number variable
   * @param streetName initializing Street Name variable
   * @param city initializing City variable
   * @param postalCode initializing Postal Code variable
   * @param country initializing Country variable
   */
  public Address(int houseNumber, String streetName, String city, int postalCode, String country)
  {
    this.houseNumber=houseNumber;
    this.streetName=streetName;
    this.city=city;
    this.postalCode=postalCode;
    this.country=country;
  }

  /**
   * Gets House Number of a Guest
   * @return House Number of a Guest
   */
  public int getHouseNumber()
  {
    return houseNumber;
  }

  /**
   * Gets Street Name of a Guest
   * @return Street Name of a Guest
   */
  public String getStreetName()
  {
    return streetName;
  }

  /**
   * Gets City of a Guest
   * @return City of a Guest
   */
  public String getCity()
  {
    return city;
  }

  /**
   * Get Postal code of a Guest
   * @return Postal code of a Guest
   */
  public int getPostalCode()
  {
    return postalCode;
  }

  /**
   * Get Country of a Guest
   * @return Country of a Guest
   */
  public String getCountry()
  {
    return country;
  }

  /**
   * Set House number of a Guest
   * @param houseNumber takes house number of a Guest
   */
  public void setHouseNumber(int houseNumber)
  {
    this.houseNumber = houseNumber;
  }

  /**
   * Set Street number of a Guest
   * @param streetName takes street number of a Guest
   */
  public void setStreetName(String streetName)
  {
    this.streetName = streetName;
  }

  /**
   * Set city of a Guest
   * @param city takes city of a Guest
   */
  public void setCity(String city)
  {
    this.city = city;
  }

  /**
   * Set postal code of a Guest
   * @param postalCode takes postal code of a Guest
   */
  public void setPostalCode(int postalCode)
  {
    this.postalCode = postalCode;
  }

  /**
   * set country of a Guest
   * @param country takes country of a Guest
   */
  public void setCountry(String country)
  {
    this.country = country;
  }

  /**
   * Equals method to compare two Addresses
   * @param obj used to compare
   * @return true or false. If both addresses match, returns true otherwise false.
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }
    Address other = (Address) obj;
    return houseNumber == other.houseNumber
        && streetName.equals(other.streetName)
        && city.equals(other.city)
        && postalCode==other.postalCode
        && country.equals(other.country);
  }

  /**
   * Gets a String representation of the Address class
   * @return a String containing information about all Address objects
   */
  public String toString()
  {
    return "House Number: "+houseNumber+"\n"
        + "Street Name: "+streetName+"\n"
        +"City: "+city+"\n"
        +"Postal Code: "+postalCode+"\n"
        +"Country: "+country;
  }
  }