package Features;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class ScenarioSteps {
	
	WebDriver driver = null; 
	
	@Given("^Je suis sur google$")
	public void je_suis_sur_google(){
		driver = new ChromeDriver(); 
	    driver.get("http://google.fr"); 
	}

	@Then("^Je devrais voir \"([^\"]*)\"$")
	public void je_devrais_voir(String arg1){
		driver.getPageSource().contains(arg1);
	}

	@When("^Je saisie \"([^\"]*)\"$")
	public void je_saisie(String arg1){
		WebElement recherche=driver.findElement(By.id("lst-ib"));
		recherche.sendKeys(arg1);
	}

	@When("^Je clique sur le bouton de recherche$")
	public void je_clique_sur_le_bouton_de_recherche(){
		WebElement rechercheB=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]"));
		rechercheB.click();
		
	}
	

	
	/*@Given("^Je suis sur google")
	public void je_suis_sur_google() throws Throwable {
		driver = new ChromeDriver(); 
	    driver.navigate().to("http://google.fr"); 
	    throw new PendingException();
	}

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
	    throw new PendingException();
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys(arg1);
	    driver.findElement(By.id("u_0_v")).click();
	    throw new PendingException();
	}

	@Then("^Login should fail$")
	public void login_should_fail() throws Throwable {
		if(driver.getCurrentUrl().equalsIgnoreCase(
		         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
		            System.out.println("Test1 Pass"); 
		      } else { 
		         System.out.println("Test1 Failed"); 
		      } 
		      driver.close();
	    throw new PendingException();
	}*/


}