package phcheckin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Negativescenario {
	public static void main(String[] args) {
		///NEGATIVE SCENARIO 2: 
		//BPN Number: 037962764900I0
		//Incorrect claim number: 980841453 
		//User ID: agmb29
		
		System.setProperty("webdriver.chrome.driver","C:\\Projects\\EclipseWorkspace\\REKHA\\PH-Website-Dyanmic URL\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.acpt.coloniallife.com//customers/claims/claimsdetails.aspx?bpn=486ED7E673CB3DF371CF3C2399F18FAA&claimNumber=4F094B911D4F00BFE0CC52E583C5498A");
		WebElement userId= driver.findElement(By.id("LoginId"));
		userId.sendKeys("agmb29");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("colonial");
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver,50);
		WebElement text= driver.findElement(By.id("pagecontentplaceholder_0_standardcontentplaceholder_0_claimCheckSummaryListView_ctrl0_paymentMessage"));
		System.out.println(text.isDisplayed());
		driver.close();
		
		
	}

}
