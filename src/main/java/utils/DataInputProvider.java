package utils;

import org.testng.annotations.DataProvider;

public class DataInputProvider {
	
	@DataProvider(name = "fetchData")
	public static String[][] getData(){		
		String[][] data = new String[2][5];	
		data[0][0] = "TestLeaf";
		data[0][1] = "Yuva";
		data[0][2] = "M";
		data[0][3] = "nesa@testleaf.com";
		data[0][4] = "420420420";		
	
		data[1][0] = "TestLeaf";
		data[1][1] = "Sarath";
		data[1][2] = "M";
		data[1][3] = "sarath@testleaf.com";
		data[1][4] = "420";
		return data;		
	}

}
