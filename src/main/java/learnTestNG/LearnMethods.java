package learnTestNG;

import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;

public class LearnMethods extends ProjectSpecificWrapper {

	@Test
	public void createLead() throws Exception{		
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","cName");
		enterById("createLeadForm_firstName"," fName");
		enterById("createLeadForm_lastName", "lName");		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");		
	}	

	@Test
	public void  createContact() throws Exception {
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");		
	}	





}
