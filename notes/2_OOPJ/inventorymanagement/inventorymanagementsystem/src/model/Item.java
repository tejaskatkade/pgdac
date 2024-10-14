package model;

public class Item {
	private int id;
	private String name;
	
	public Item() {};
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	};

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%-5d%-5s",id,name);
	}
}
