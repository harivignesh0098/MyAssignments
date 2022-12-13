package week3day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeLaunch 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("vignesh");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi Friends");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1,00,000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Tester");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("908");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("0092");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I Am Tester");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9087920092");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("10");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hari090600@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.hari.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Moorthy");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Madurai");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Velachery");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("602001");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
	}

}
