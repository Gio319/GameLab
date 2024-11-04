package game;

public class Item {

	private String name;
	private String description;
	
	public Item(String n ,String desc) {
		description = desc;
		name = n;		
	}
	public String toString() {
	return name + "";
	}
	
	public String getDesc() {
	return description;
	}
	
	public String getName() {
		return name;
	
	}
	public void setDesc(String d) {
		description = d;
	}
	public void setName(String n) {
		name = n;
	}
	public void open() {
		Game.print("You can't open that! ");
	}
	public void use() {
		Game.print("You can't use that! ");
	}
	
}