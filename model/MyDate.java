package model;

/**
 * A class containing Date variables required to create Date objects
 * @author Saranjeet Singh
 * @version 1.0
 */
public class MyDate
{
  private int day;
  private int month;
  private int year;

  /**
   * Constructor initializing the Date class variables
   * @param day initializing day variable
   * @param month initializing month variable
   * @param year initializing year variable
   */
  public MyDate(int day, int month, int year)
  {
    this.day=day;
    this.month=month;
    this.year=year;
  }

  /**
   * Get day, will be used in other classes as part of date
   * @return day required as part of date in other classes
   */
  public int getDay()
  {
    return day;
  }

  /**
   * Sets day for a date
   * @param day takes day for a specific date
   */
  public void setDay(int day)
  {
    this.day = day;
  }

  /**
   * Get Month, will be used in other classes as part of date
   * @return month, required as part of date in other classes
   */
  public int getMonth()
  {
    return month;
  }

  /**
   * Sets month for a date
   * @param month takes month for a specific date
   */
  public void setMonth(int month)
  {
    this.month = month;
  }

  /**
   * Get Year, will be used in other classes as part of date
   * @return year, required as part of date in other classes
   */
  public int getYear()
  {
    return year;
  }

  /**
   * Sets year for a date
   * @param year takes year for a specific date
   */
  public void setYear(int year)
  {
    this.year = year;
  }

  /**
   * Equals method to compare two dates
   * @param obj used to compare
   * @return true or false. If both dates match, returns true otherwise false
   */
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Guest))
    {
      return false;
    }
     MyDate other = (MyDate) obj;
    return day == other.day
        && month == other.month
        && year==other.year;
  }

  /**
   * Gets a String representation of the Date class
   * @return a String containing information about all date objects
   */
  public String toString()
  {
    return "Date "+day+" "+month+" "+year;
  }

  /**
   *Copy method since Date is a composition class. Required to keep its own objects and to create copies
   * @return a copy of the Date variables
   */
  public MyDate copy()
  {
    return new MyDate(day,month,year);
  }

//  public int numberOfDaysInBooking()
//  {
//    DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd MM yyyy");
//
//  }


}