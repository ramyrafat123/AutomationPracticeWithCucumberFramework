package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountsPageSteps {
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private AccountsPage accountpage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
	  
		List<Map<String, String>> creList=credTable.asMaps();
		String userName=creList.get(0).get("username");
		String password=creList.get(0).get("password");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    accountpage =loginpage.dologin(userName, password);
		
	
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
	  
		accountpage.getAccountsPageTitle();
		
	}

	@Then("user get accounts section")
	public void user_get_accounts_section(DataTable secTable) {
		
		List<String> expAccountSectionList = secTable.asList();
		System.out.println("Expected Section List " + expAccountSectionList);
		
		List<String> actualAccountsSectionsList=accountpage.getAccountsSectionsList();
		System.out.println("Actual Section List " + actualAccountsSectionsList);
		
	    
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer int1) {
		Assert.assertTrue(accountpage.getAccountSectionCount()== int1);

	   
	}

}
