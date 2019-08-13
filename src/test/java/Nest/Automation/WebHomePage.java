package Nest.Automation;

import org.testng.annotations.Test;

public class WebHomePage {

	@Test
	public void launch() {
		System.out.println("Launch the Application");
	}
	
	@Test
	public void login() {
		System.out.println("Login to the Application");
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Verifying the HomePage");
	}
}
