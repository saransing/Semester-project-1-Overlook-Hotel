package model;

import java.util.ArrayList;

public class RoomList
{
  private int numberOfRooms;
  private ArrayList<Room>list;


  public RoomList(int numberOfRooms)
  {
    this.numberOfRooms = numberOfRooms;

    list = new ArrayList<>();
  }

  public void addRoom(Room room)
  {
    if(list.size()<=numberOfRooms)
    {
      return;
    }
    list.add(room);
  }

  public void deleteRoom(Room room)
  {
   list.remove(room);
  }

  public Room[] searchForRoomByRoomNumber(int roomNumber)
  {
   ArrayList<Room>temp = new ArrayList<>();

   for(int i=0; i<list.size();i++)
   {
     if(list.get(i).getRoomNumber()==roomNumber){
       temp.add(list.get(i));
     }
   }

   return temp.toArray(new Room[0]);
  }

  public Room[] searchForRoomByRoomType(String roomType)
  {
    ArrayList<Room>temp = new ArrayList<>();

    for(int i=0; i<list.size();i++)
    {
      if(list.get(i).getRoomType().equals(roomType)){
        temp.add(list.get(i));
      }
    }

    return temp.toArray(new Room[0]);
  }




public String toString() {
    StringBuilder value = new StringBuilder();

  for (Room room : list)
  {
    value.append(room.toString()).append("\n");
  }

  return value.toString();
}


}
