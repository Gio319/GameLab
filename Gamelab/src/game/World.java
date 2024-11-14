package game;

public class World {

	public static Room buildWorld() {
		// Room constructs
		Room bathroom = new Room("bathroom","Walking in there is a foul stench that invades your nose.");
		Room darkBasement = new Room("Dark Basement","You are in a Dark Basement.");
		Room boilerRoom = new Room("Boiler Room","You are in the Boiler Room.");
		Room westHall = new Room("West Hall","you are now in the West hall");
		Room eastHall = new Room("East Hall","You are now in the East Hall"); 
		Room livingroom = new Room("Living Room","you are now in the what appears to be the livingroom");
		Room diningroom = new Room("Dining Room", " You are now in the room up the stairs, Which seems to be a dining Room.");
		Room closet = new Room("Closet","You are now in a hall closet pretty big for just a closet.");
		Room kitchen = new Room("kitchen","You are now in the kitchen what is that stench.");
		
		
		//Item Constructs
		Safe safe = new Safe("safe", "It's an impressive safe!");
		Combination note = new Combination("note","This paper has a poorly written combination wonder what it goes to.");
		Item doll = new Item("Creepy Doll","its a creepy all raggedy doll, feels like its watching.");
		Item crowbar = new Item ("crowbar", "this is a rusty crowbar"); // The item that they would brake the door to get out of the basement.
		Item finger = new Item("finger","a part of a body thats not on a body, how'd it get here.");
		Item paper = new Item("paper","its a Blank sheet of paper seems to be nothing on it. "); // The paper showing where the closet key is located.
		Item blacklight = new Item("blacklight","This light is able to detect blood and other fluids the naked eye can't"); // The light will shine on the paper
		Item knife = new Item("knife","It has a red crusty residue on it... Best hope its from cooking..."); 
		Item lighter = new Item ("lighter","Its a steel rusty zippo lighter that smells like ciggars."); // Lighter to melt the wax on the box
		Item box = new Item("box"," Its a wax sealed box that has something small and metal rattling around in it."); // This box will hold the key to the outside
		Item vase = new Item("vase", "its a vase that is old and dusty");
		
		// Basement Code
		darkBasement.addExit(boilerRoom, 'e');
		darkBasement.addExit(diningroom,'u');
		darkBasement.addObject(safe);
		
		

		//Boiler Room Code
		boilerRoom.addExit(darkBasement, 'w');
		boilerRoom.addObject(crowbar);
		boilerRoom.addobject(lighter);
		
		//Dining Room Code
		diningroom.addExit(eastHall, 'e');
		diningroom.addExit(westHall, 'w');
		diningroom.addExit(livingroom,'n');
		diningroom.addExit(kitchen,'s');
		diningroom.addExit(darkBasement, 'd');
		diningroom.addObject(finger);
		//diningroom.setLocked();
		
		//West Hall Code
		westHall.addExit(diningroom, 'e');
		westHall.addExit(closet, 'w');
		
		// Closet Code
		closet.addExit(westHall, 'e');
		closet.addObject(box);
		closet.setLocked();
		
		// East Hall Code
		eastHall.addExit(diningroom, 'w');
		eastHall.addExit(bathroom, 's');
		eastHall.addObject(doll);
		
		// Bathroom Code
		bathroom.addExit(eastHall, 'n');
		bathroom.addObject(blacklight);
		
		
		//Kitchen Code
		kitchen.addExit(diningroom, 'n');
		kitchen.addObject(knife);
		kitchen.addObject(paper);
		
		// Living Room code
		livingroom.addExit(diningroom, 's');
		livingroom.addObject(vase);
		return darkBasement;
		
		
		
		
		
	

		
	}
}
