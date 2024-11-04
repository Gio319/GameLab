package game;

public class World {

	public static Room buildWorld() {
		Room darkBasement = new Room("You are in a Dark Basement.");
		Item doll = new Item("Creepy Doll","its a creepy all raggedy doll, feels like its watching.");
		Room boilerRoom = new Room("You are in the Boiler Room.");
		Item crowbar = new Item ("crowbar", "this is a rusty crowbar");
		Room westHall = new Room("you are now in the West hall");
		Item finger = new Item("finger","a part of a body thats not on a body, how'd it get here.");
		Room eastHall = new Room(" You are now in the East Hall"); 
		Room livingroom = new Room("you are now in the what appears to be the livingroom");
		Room diningroom = new Room("You are now in the room up the stairs, Which seems to be a dining Room.");
		Item fridge = new Item("Fridge","A staple appliance in any home, but why is it chained shut");
		Room kitchen = new Room("You are now in the kitchen what is that stench.");
		Item cabinet = new Item("cabinet"," talk about an inconvience.");
		Item knife = new Item("knife","It has a red crusty residue on it... Best hope its from cooking...");
		Combination note = new Combination("note","This paper has a poorly written combination wonder what it goes to.");
		Safe safe = new Safe("safe", "It's an impressive safe!");
		
		
		
		// Traveling from the basement
		darkBasement.addExit(boilerRoom, 'e');
		darkBasement.addExit(diningroom,'u');
		darkBasement.addObject(note);
		darkBasement.addObject(safe);
		//Traveling From the boiler room
		boilerRoom.addExit(darkBasement, 'w');
		boilerRoom.addObject(crowbar);
		// traveling from the dining room
		diningroom.addExit(eastHall, 'e');
		diningroom.addExit(westHall, 'w');
		diningroom.addExit(livingroom,'n');
		diningroom.addExit(kitchen,'s');
		diningroom.addExit(darkBasement, 'd');
		diningroom.addObject(finger);
		//traveling from left hall 
		westHall.addExit(diningroom, 'e');
		// traveling from right hall
		eastHall.addExit(diningroom, 'w');
		eastHall.addObject(doll);
		// traveling through the kitchen
		kitchen.addExit(diningroom, 'n');
		kitchen.addObject(knife);
		kitchen.addObject(cabinet);
		kitchen.addObject(fridge);
		// traveling from livingroom
		livingroom.addExit(diningroom, 's');
		return darkBasement;
		
	

		
	}
}
