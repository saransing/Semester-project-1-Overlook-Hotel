package model;

public class Guest
{
  private String firstName;
  private String lastName;
  private int phoneNumber;
  private String nationality;
  private Address address;
  private Date dateOfBirth;


  public Guest(String firstName,String lastName, int phoneNumber, String nationality, Address address, Date dateOfBirth)
  {
    this.firstName=firstName;
    this.lastName=lastName;
    this.phoneNumber=phoneNumber;
    this.nationality=nationality;
    this.address=address;
    this.dateOfBirth=dateOfBirth;
  }

  public String getName(){
    return firstName+" "+lastName;
  }

  public int getPhoneNumber(){
    return phoneNumber;
  }

  public String getNationality(){
    return nationality;
  }

  public Address getAddress(){
    return address;
  }

  public Date getDateOfBirth(){  //do we need this method?
    return dateOfBirth;
  }

  public void setName(String firstName, String lastName){
  }

  public void setPhoneNumber(int phoneNumber){
  }

  public void setNationality(String nationality){
  }

  public void setAddress(Address address) {
  }

  public void setDateOfBirth(Date dateOfBirth){
  }

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

  public String toString(){
    return "Name: "+firstName+" "+lastName+"\n"
        + "Phone number: "+phoneNumber+"\n"
        +"Nationality: "+nationality+"\n"
        +"Address: "+address+"\n"
        +"Date of birth: "+dateOfBirth;
  }

}
