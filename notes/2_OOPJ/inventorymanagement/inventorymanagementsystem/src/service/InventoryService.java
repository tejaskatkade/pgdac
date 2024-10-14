package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import model.Item;
import utils.SortById;

public class InventoryService {
	private List<Item> list  = new ArrayList<Item>();
	
	public void add(Item i) {
		
		boolean val = false;
		
		for (Iterator<Item> iterator = list.iterator(); iterator.hasNext();) {
			Item item = (Item) iterator.next();
			
			if(item.getName().equals(i.getName()) && item.getId() == i.getId()) {
				val = true;
				System.out.println("Item already exist");
				break;
			}
		}
		
		if(!val){
			list.add(i);
			System.out.println("Item added");
		}
		
	}
	
	public void printInventory(List<Item> list) {
		for(Iterator<Item> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
	
	public List<Item> sortedListById() {
		return list.stream().sorted(new SortById()).collect(Collectors.toList());
	}

}
