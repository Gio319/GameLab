package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

	public static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void main(String[] args) {
		runGame();	
	}
	public static void print(Object obj) {
		System.out.println(obj.toString());}

	public static Room currentRoom = World.buildWorld();{
	}
		
	
	public static Item getItem(String n) {
		for (Item i : inventory) {
			String c =i.toString();
		if (c.equals(n)) {
			return i;}
		
		}
		return null;
	}
	
	
	public static void runGame() {
	
		Scanner input = new Scanner(System.in);
		String command;
		do {
			System.out.println(currentRoom);
			System.out.print("What would you like to do?: ");
			command = input.nextLine();
			String[] words = command.split(" ");
			switch(words[0]) {
			// Take cases
			case "take":
			case "t":
					System.out.println("You are trying to grab "+ words[1]+".");
				if (currentRoom.objects.containsKey(words[1]) == false) {
					System.out.println("There is no object to take");
					break;
				}
				else {
					if (currentRoom.getObject(words[1]).getTake() == false) {
						System.out.println("You can't carry" + words[1]);
						break;
					}
					else {
				inventory.add(currentRoom.getObject(words[1]));
				System.out.println("You took " + currentRoom.getObject(words[1]).getName()+"\n");
				currentRoom.removeItem(words[1]);
				break;}
				}
				
				// Look cases
			case "look":
			case "l":
					System.out.println("You are trying to look at " + words[1]);
	
					if (currentRoom.objects.containsKey(words[1]) == false) {
						for (Item i : inventory) {
							if (words[1] .equals(i.getName())) {
								System.out.println(words[1]+" is in your inventory. \n");
								System.out.println(i.getDesc());	
							}
							else {
								System.out.println("You look at nothing.... feel proud.\n");
							}
						}
				
					}
						
				//	}
					else {
						System.out.println("You look at "+ currentRoom.getObject(words[1]));
						System.out.println(currentRoom.getObject(words[1]).getDesc()+"\n");
						
					}
				break;
				
				
			case "use":
				System.out.println("You are trying to use" + words[1]);
				
				if (currentRoom.objects.containsKey(words[1]) == false) {
					for (Item i : inventory) {
						if (words[1] .equals(i.getName())) {
							i.use();
							
						}
						else {
							System.out.println("This item is no where to be found.\n");
							System.out.println("So you can't use "+words[1]);
						}
					}
			
				}
					
			//	}
				else {
					
					currentRoom.getObject(words[1]).use();
					}
				break;
					
			case "open":
						System.out.println("You are trying to open" + words[1]);
				
				if (currentRoom.objects.containsKey(words[1]) == false) {
					for (Item i : inventory) {
						if (words[1] .equals(i.getName())) {
							i.open();
						}
						//else {
						//	System.out.println("This item is no where to be found.\n");
							//System.out.println("So you can't open "+words[1]);
						//}
					}
			
				}
					
			//	}
				else {
					
					currentRoom.getObject(words[1]).open();
					}
				break;
				// Inventory cases
			case "i":
				if (inventory.size()>0) {
					System.out.println("");
					System.out.println("Your inventory: ");
					for (int i = 0;i<inventory.size();i++) {
						Item s = inventory.get(i);
						System.out.println(s);
					}
					System.out.println("");
				}
				else {
					System.out.println("");
					System.out.println("YOU HAVE NOTHIIIIIIIING!!!!");
					System.out.println("");
					
				}
				break;
			case "n":
			case "w":
			case "e":
			case "s":
			case "u":
			case "d":
				Room nextRoom = currentRoom.getExit(command.charAt(0));
				if (nextRoom == null) {
					System.out.println("That is not a direction you can go. ");
					break;
				}
				else {
					if (nextRoom.getLock() == true) {
						System.out.println("The door is locked Try finding something to open it.");
						break;
					}
					else {
					currentRoom = nextRoom;
				System.out.println("");
				break;}}
			
			case "x":
				System.out.println("Thanks for walking through my game");
				break;
			default:
				System.out.println("I don't know what that means.");
			}
		}while(!command.equals("x"));
		
		input.close();
	}
}
