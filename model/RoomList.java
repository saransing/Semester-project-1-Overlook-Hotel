package model;

import java.util.ArrayList;

public class RoomList
{
  private int numberOfRooms;
  private ArrayList<Room> rooms;

  /**
   *
   * @param numberOfRooms
   */
  public RoomList(int numberOfRooms)
  {
    this.numberOfRooms = numberOfRooms;
    rooms = new ArrayList<>();
  }

  public RoomList()
  {

  }
  public void addRoom(Room room)
  {
    if(rooms.size()<=numberOfRooms)
    {
      return;
    }
    rooms.add(room);
  }

  public void deleteRoom(Room room)
  {
    if(rooms.contains(room))
    rooms.remove(room);
  }

  public Room searchForRoomByRoomNumber(int roomNumber)
  {
    for (int i = 0; i < rooms.size(); i++)
    {
      if (rooms.get(i).getRoomNumber() == roomNumber)
      {
        return rooms.get(i);
      }
    }
    return null;
  }

  public ArrayList<Room> searchForRoomByRoomType(String roomType)
  {
    ArrayList<Room> temp = new ArrayList<>();
    for(int i = 0; i< rooms.size(); i++)
    {
      if (rooms.get(i).getRoomType().equals(roomType))
      {
        temp.add(rooms.get(i));
      }
    }
    return temp;
  }

public String toString() {
    StringBuilder value = new StringBuilder();

  for (Room room : rooms)
  {
    value.append(room.toString()).append("\n");
  }
  return value.toString();
}

  /**
   *
   * @return
   */
  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  public double getPriceByRoomType(String roomType){
    for(int i=0; i<rooms.size(); i++){
      if (rooms.get(i).getRoomType().equals(roomType)){
        return rooms.get(i).getRoomPrice();
      }
    }
    return -1;
    }
}
