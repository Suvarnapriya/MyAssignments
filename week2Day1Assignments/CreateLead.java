package week2Day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement company = driver.findElement(By.id("createLeadForm_companyName"));
		company.sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Seetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Seethu");
		driver.findElement(By.className("inputBox")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Selenium testing");
		driver.findElement(By.name("primaryEmail")).sendKeys("suvarnapriya.v@gmail.com");
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		
		state.selectByVisibleText("New York");
		
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
	
		System.out.println(title);
		
		
	}

}
