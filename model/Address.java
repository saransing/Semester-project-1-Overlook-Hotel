package model;

public class Address
{
  private int houseNumber;
  private String streetName;
  private String city;
  private int postalCode;
  private String country;

  public Address(int houseNumber, String streetName, String city, int postalCode, String country)
  {
    this.houseNumber=houseNumber;
    this.streetName=streetName;
    this.city=city;
    this.postalCode=postalCode;
    this.country=country;
  }

  public int getHouseNumber()
  {
    return houseNumber;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public String getCity()
  {
    return city;
  }

  public int getPostalCode()
  {
    return postalCode;
  }

  public String getCountry()
  {
    return country;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }
    Address other = (Address) obj;
    return houseNumber == other.houseNumber
        && streetName == other.streetName
        && city==other.city
        && postalCode==other.postalCode
        && country==other.country;
  }

  public String toString()
  {
    return "House Number: "+houseNumber+"\n"
        + "Street Name: "+streetName+"\n"
        +"City: "+city+"\n"
        +"Postal Code: "+postalCode+"\n"
        +"Country: "+country;
  }
  }