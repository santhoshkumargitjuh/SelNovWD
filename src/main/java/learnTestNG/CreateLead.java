package leaf.Lead;

import org.testng.annotations.Test;

import utils.DataInputProvider;
import wrappers.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{

	@Test(dataProvider ="fetchData", dataProviderClass = DataInputProvider.class)
	public void createLead(String cName, String fName, String lName, String eMail, String ph) throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",cName);
		enterById("createLeadForm_firstName",fName);
		enterById("createLeadForm_lastName", lName);		
		enterById("createLeadForm_primaryEmail", eMail);
		enterById("createLeadForm_primaryPhoneNumber", ph);
		clickByName("submitButton");		
	}	
	
/*	@DataProvider(name = "fetchData")
	public String[][] getData(){		
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
	}*/
	
	
	
	
	
	
	
	
	
	


}









