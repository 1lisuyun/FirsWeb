package guoya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://software//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://www.baidu.com");
		
		Thread.sleep(2000);
		
		boolean isSuccess=driver.getPageSource().contains("百度一下");
		System.out.println(isSuccess);
		
		WebElement userName=driver.findElement(By.id("kw"));
		userName.clear();
		userName.sendKeys("德邦");
		
		Thread.sleep(2000);
		
		/*WebElement password=driver.findElement(By.id("12345678"));
		password.clear();
		password.sendKeys("12345678");
		*/
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.id("su"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("德邦");
		System.out.println(isSuccess);
		
		driver.quit();
		
	}
}


