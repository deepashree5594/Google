import java.util.HashMap;

public class MostBookedHotelRoom {
        public static void main(String[] args) {
            String[] test={"+1A", "+3E", "-1A", "+4F", "+1A", "-3E"};
            String[] test1={"+1A", "+3E", "-1A", "+4F", "+1A", "-3E", "+3E"};
            mostBookedHotelRoom(test1);
        }
        public static void mostBookedHotelRoom(String[] booked){
            String most="";
            int max=0;
            HashMap<String, Integer> record=new HashMap<>();
            for(String s:booked){
                String room=s.substring(1);
                if(record.containsKey(room)){
                    if(s.substring(0,1).equals("+")) record.put(room, record.get(room)+1);
                }else{
                    if(s.substring(0,1).equals("+"))
                        record.put(room, 1);
                    //else record.put(room, 0);
                }
            }
            for(String room:record.keySet()){
                if(record.get(room)>max) {
                    max=record.get(room);
                    most=room;
                }
                else if(record.get(room)==max){
                    if(room.charAt(room.length()-1)<most.charAt(room.length()-1)){
                        max=record.get(room);
                        most=room;
                    }
                }
            }
          System.out.println(most);
        }
    }
