package game;
import java.util.HashMap;

public class Room {

	private String description;
	private Room east;	
	private Room west;	
	private Room north;	
	private Room south;	
	private Room up;	
	private Room down;
	
	//public Item object;
	public HashMap<String,Item> objects = new HashMap<String,Item>() ;
	
	
	public void addObject(Item i) {
	  objects.put(i.getName(), i); 					// this is the set method
	}
	public Item getObject(String object) {
		return objects.get(object);
	}
	public void removeItem(String object) {
		objects.remove(object);
	}
	
	public Room(String script) {
		description = script;
	}
	public Room getExit(char exit) {
		if (exit =='e') {
			return east;
			}
		else if (exit =='w') {
			return west;
		}
		else if (exit =='n') {
			return north;
		}
		else if (exit =='s') {
			return south;
		}
		else if (exit =='u') {
			return up;
		}
		else if (exit =='d') {
			return down;
		}
		else {
			return null;
		}
	} // End of getExit
	public void addExit(Room r,char c) {
		if (c == 'e') {
			east = r;
		}
		else if (c=='w') {
			west = r;
		}
		else if (c == 'n') {
			north = r;
		}
		else if (c == 's') {
			south = r ;
		}
		else if (c == 'u') {
			up = r;
		}
		else if (c == 'd') {
			down = r ;
		}
		
	}// End of exit room

	public String toString() {
		return description + "";
	}// End of toString
	
	}
