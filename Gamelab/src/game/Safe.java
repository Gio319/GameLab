package game;

public class Safe extends Item {
	
	public Safe(String n, String desc) {
		super(n, desc);
		
	}
	public void open() {
		for (Item i: Game.inventory) {
			if( i.getName().equals("note")) {
				Item diamond = new Item("diamond","A shiny Diamond");
				Game.print("Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
				Game.inventory.add(diamond);
				break;
			}
			else {
				
			}
			Game.print("The safe is locked and you don't have the combination.\n");
			
			}

		
		
		
		}
	}


