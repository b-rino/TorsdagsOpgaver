package Torsdagsopgaver5.task3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Room room0 = new Room(4, 2);
    Room room1 = new Room(3, 1);
    Room room2 = new Room(2, 1);
    ArrayList <Room> rooms = new ArrayList();
    rooms.add(room0);
    rooms.add(room1);
    rooms.add(room2);
    Building building = new Building(rooms, 5);
        System.out.println(countLampsInBuilding(building));
        System.out.println(countWindowsInBuilding(building));
        System.out.println(countRoomsInBuilding(building));
        System.out.println(isNormal(building));
    }

    public static int countLampsInBuilding(Building b) {
        int count = 0;
        for(Room r : b.getRooms()){
            count += r.getNumberOfLamps();
        }
        return count;
    }

    public static int countWindowsInBuilding(Building b) {
        int count = 0;
        for(Room r : b.getRooms()){
            count += r.getNumberOfWindows();
        }
        return count;
    }
    public static int countRoomsInBuilding(Building b) {
    return b.getRooms().size();
    }

    public static boolean isNormal(Building b){
        if(b.getNumberOfFloors() >= countRoomsInBuilding(b)){
            return true;
        }
        return false;
    }
}
