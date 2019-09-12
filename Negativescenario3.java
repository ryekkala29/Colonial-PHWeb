package phcheckin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negativescenario3 {
	public static void main(String[] args) {
		//Correct BPN: 037962764900I0 
		//Correct Claim number: 980841463
		//Correct user ID: agmb29
		//Please find the below negative scenario with the user ID ‘meimb’

		System.setProperty("webdriver.chrome.driver","C:\\Projects\\EclipseWorkspace\\REKHA\\PH-Website-Dyanmic URL\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.acpt.coloniallife.com//customers/claims/claimsdetails.aspx?bpn=959F835B76242544ED9C1499E60A1E40&claimNumber=4F094B911D4F00BFE0CC52E583C5498A");
		WebElement logo= driver.findElement(By.className("logo"));
		System.out.println(logo.isDisplayed());	
		WebElement userId= driver.findElement(By.id("LoginId"));
		userId.sendKeys("meimb");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("colonial");
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		WebElement txt= driver.findElement(By.id("pagecontentplaceholder_0_standardcontentplaceholder_0_claimCheckSummaryListView_ctrl0_paymentMessage"));
		System.out.println(txt.isDisplayed());
		driver.close();
				
		
	}
}
