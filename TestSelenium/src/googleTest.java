import java.util.concurrent.ThreadPoolExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {

	public static void main(String[] args) throws InterruptedException{

		
		//creation d'un objet Webdriver
		WebDriver wd=new  FirefoxDriver();
		
		//ouvrir le moteur de recherche google
		wd.get("http://google.fr");
		String titrePage=wd.getTitle();
		assert titrePage.equals("Google"):"La page ouverte n'est pas de google";
		
		WebElement rechercheText;
		WebElement rechercheBouton;
		WebElement lien;
		
		rechercheText=wd.findElement(By.id("lst-ib"));
		rechercheBouton=wd.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]"));
		
		rechercheText.sendKeys("CGI");
		rechercheBouton.click();
		Thread.sleep(5000);
		//CGI Confédération - Nos actions, Missions & Formations - cgi-cf.com
		lien=wd.findElement(By.linkText("CGI Recrute"));
		lien.click();
		wd.quit();
		
		
	}

}
