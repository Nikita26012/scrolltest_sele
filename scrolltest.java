package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolltest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=  (JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,-800)");
		
		
		
}
}