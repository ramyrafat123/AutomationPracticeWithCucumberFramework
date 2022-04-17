package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {
	private LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	private ProductPage productpage;
	private AccountsPage accountpage;
	private WebDriver driver;
	
	@Given("user navigate to Women Category")
	public void user_navigate_to_women_category(DataTable credTable) {
		List<Map<String, String>> creList=credTable.asMaps();
		String userName=creList.get(0).get("username");
		String password=creList.get(0).get("password");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    accountpage =loginpage.dologin(userName, password);
	   
	}

	@When("User Select “Blouses” Subcategory")
	public void user_select_blouses_subcategory() {
		productpage.clickHoverEveningDresses(driver);
	    
	}

	@Then("User get page with title {string}")
	public void user_get_page_with_title(String string) {
	    
	}


}
