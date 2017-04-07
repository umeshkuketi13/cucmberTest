import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefination {

	
	@Given("^Open browser$")
	public void OpenBrowser()
	{
		System.out.println("Opening browser");
		
	}

	@When("^Enter username and password$")
		public void UserNameandPassword()
		{
			System.out.println("Enter User name password");
			
		}

	@Then("^Display message login sucessful$")
	public void DisplayLogin()
	{
		System.out.println("Login sucessfull....");
		
	}


	
	
}
