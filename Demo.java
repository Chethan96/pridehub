package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	String driverPath = "C:\\Users\\DELL\\geckodriver-v0.34.0-win32\\geckodriver.exe";

	public WebDriver driver;

	@Test(priority = 0)

	public void AppLaunch() {

		System.setProperty("webdriver.gecko.driver", driverPath);

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://ultimateqa.com/complicated-page");
	}
	@Test(priority = 1)
	public void Services() throws Exception {

		driver.findElement(By.xpath("//a[text()='Services']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");

	}

	@Test(priority = 2)
	public void About() throws Exception {

		driver.findElement(By.xpath("//a[text()='About']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");

	}
	@Test(priority = 3)
	public void Blog() throws Exception {

		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");

	}
	@Test(priority = 4)
	public void Education() throws Exception {
		driver.findElement(By.xpath("//a[text()='Education']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");


	}
	@Test(priority = 5)
	public void Freecourse() throws Exception {
		driver.findElement(By.xpath("//a[text()='Education']")).click();
		driver.findElement(By.xpath("//a[text()='Free Courses']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");
	}
	@Test(priority = 6)
	public void Nextpage() throws Exception {
		driver.findElement(By.xpath("//a[text()='I want a free DISCOVERY SESSION']")).click();
		Thread.sleep(5000);
		driver.get("https://ultimateqa.com/complicated-page");
	}

}
