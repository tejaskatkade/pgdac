package main;

import model.Item;
import service.InventoryService;

public class InventoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InventoryService is = new InventoryService();
		is.add(new Item(1,"item1"));
		is.add(new Item(2,"item2"));
		is.add(new Item(3,"item4"));
		is.add(new Item(3,"item3"));
		is.add(new Item(4,"item4"));
		
		is.printInventory(is.sortedListById());
	}
	
	

}
