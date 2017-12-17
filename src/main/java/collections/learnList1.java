package collections;

import java.util.ArrayList;
import java.util.List;

public class learnList1 {
	
	public static void main(String[] args) {
		//size
		// add
		//remove
		//contains
		//get
		//clear
		//isEmpty
		
		List<String> list = new ArrayList<String>();		
		
		list.add("rice");
		list.add("littleHeart");
		list.add("sugar");
		list.add("rice");
		
		for (String eachItem : list) {
			System.out.println(eachItem);
		}		
		list.remove("sugar");
		System.out.println(list.contains("sugar"));		
		System.out.println(list.get(1));
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
		
		
		
	}

}
