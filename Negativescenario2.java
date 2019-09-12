package phcheckin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Negativescenario2 {
	public static void main(String[] args) {
		//NEGATIVE SCENARIO 2: 
		//Incorrect BPN: 037962764900I0 
		//Claim number: 980841463

		//User ID: agmb29

		System.setProperty("webdriver.chrome.driver","C:\\Projects\\EclipseWorkspace\\REKHA\\PH-Website-Dyanmic URL\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.acpt.coloniallife.com//customers/claims/claimsdetails.aspx?bpn=959F835B76242544ED9C1499E60A1E40&claimNumber=D84C04B211ADD094751BD546994D1162");
		WebElement userid= driver.findElement(By.id("LoginId"));
		userid.sendKeys("agmb29");
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("colonial");
		WebElement submit=driver.findElement(By.id("loginButton"));
		submit.click();
		WebDriverWait wt = new WebDriverWait(driver,50);
		//Error validations
		WebElement txt= driver.findElement(By.id("pagecontentplaceholder_0_standardcontentplaceholder_0_claimCheckSummaryListView_ctrl0_paymentMessage"));
		System.out.println(txt.isDisplayed());
		driver.close();



}

}
