package utils;

import java.util.Comparator;

import model.Item;

public class SortById implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {
		return o1.getId() - o2.getId();
	}
}
