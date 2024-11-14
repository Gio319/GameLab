package game;

public class Safe extends Item {
	
	public Safe(String n, String desc) {
		super(n, desc);
		
	}
	public boolean hasDiamond = false;
	public boolean hasNote = false;
	public void open() {
		for (Item i: Game.inventory) {
			if(hasDiamond == false) {
			if( i.getName().equals("note")) {
				hasNote = true;
				Item diamond = new Item("diamond","A shiny Diamond");
				Game.print("Using the combination, you open the safe and find a diamond inside!\n Naturally, you pocket the diamond.\n");
				Game.inventory.add(diamond);
				hasDiamond = true;
				break;
			}
			}
			else {
				Game.print("You already have the Diamond.");
				break;
			}
			
		}
		if (hasNote = false) {
			Game.print("The safe is locked You should find the combonation.");
		}
	}
}

		
		
		
		
		
		




