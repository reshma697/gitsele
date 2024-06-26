package gitsele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitSelenium {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","C:\\Users\\radhakrishnan\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https:\\www.google.com");
	driver.findElement(By.name("q")).sendKeys("integrating selenium with git");
		}

	}

	

