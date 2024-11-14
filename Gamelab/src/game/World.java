package game;

public class World {

	public static Room buildWorld() {
		Room darkBasement = new Room("Dark Basement","You are in a Dark Basement.");
		Item doll = new Item("Creepy Doll","its a creepy all raggedy doll, feels like its watching.");
		Room boilerRoom = new Room("Boiler Room","You are in the Boiler Room.");
		Item crowbar = new Item ("crowbar", "this is a rusty crowbar");
		Room westHall = new Room("West Hall","you are now in the West hall");
		Item finger = new Item("finger","a part of a body thats not on a body, how'd it get here.");
		Room eastHall = new Room("East Hall","You are now in the East Hall"); 
		Room livingroom = new Room("Living Room","you are now in the what appears to be the livingroom");
		Room diningroom = new Room("Dining Room", " You are now in the room up the stairs, Which seems to be a dining Room.");
		Item fridge = new Item("Fridge","A staple appliance in any home, but why is it chained shut");
		Room kitchen = new Room("kitchen","You are now in the kitchen what is that stench.");
		Item cabinet = new Item("cabinet"," talk about an inconvience.");
		Item knife = new Item("knife","It has a red crusty residue on it... Best hope its from cooking...");
		Combination note = new Combination("note","This paper has a poorly written combination wonder what it goes to.");
		Safe safe = new Safe("safe", "It's an impressive safe!");
		Room closet = new Room("Closet","You are now in a hall closet pretty big for just a closet.");
		Item key = new Item("Key","a key that unlocks a door");
		
		// Basement Code
		darkBasement.addExit(boilerRoom, 'e');
		darkBasement.addExit(diningroom,'u');
		darkBasement.addObject(note);
		darkBasement.addObject(safe);

		//Boiler Room Code
		boilerRoom.addExit(darkBasement, 'w');
		boilerRoom.addObject(crowbar);
		
		//Dining Room Code
		diningroom.addExit(eastHall, 'e');
		diningroom.addExit(westHall, 'w');
		diningroom.addExit(livingroom,'n');
		diningroom.addExit(kitchen,'s');
		diningroom.addExit(darkBasement, 'd');
		diningroom.addObject(finger);
		
		//West Hall Code
		westHall.addExit(diningroom, 'e');
		westHall.addExit(closet, 'w');
		
		// Closet Code
		closet.addExit(westHall, 'e');
		closet.setLocked();
		
		// East Hall Code
		eastHall.addExit(diningroom, 'w');
		eastHall.addObject(doll);
		
		
		//Kitchen Code
		kitchen.addExit(diningroom, 'n');
		kitchen.addObject(knife);
		kitchen.addObject(cabinet);
		kitchen.addObject(fridge);
		
		// Living Room code
		livingroom.addExit(diningroom, 's');
		return darkBasement;
		
		
		
		
		
	

		
	}
}
