package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class learnSet1 {
	
	public static void main(String[] args) {
		//size
		// add
		//remove
		//contains
		//clear
		//isEmpty
		
		Set<String> list = new LinkedHashSet<String>();		
		
		list.add("rice");
		list.add("littleHeart");
		list.add("sugar");
		list.add("rice");
		list.add(null);		
		for (String eachItem : list) {
			System.out.println(eachItem);
		}		
		/*Set<String> list1 = new HashSet<String>();	
		list1.addAll(list);*/
		list.remove("rice");
		System.out.println(list);
	//	System.out.println(list1);
		list.clear();
		
		
		
		
		
		
	}

}
