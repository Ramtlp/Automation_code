import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithgoogle {
	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	        WebDriverManager.chromedriver().setup();

	        // Create an instance of WebDriver (in this case, using Chrome)
	        WebDriver driver = new ChromeDriver();

	        // Step 1: Launch the website
	        driver.get("https://dev.scrooge.casino/");
	        driver.manage().window().maximize();

	        // Step 2: Click on Login/Register button
	        WebElement loginRegisterButton = driver.findElement(By.xpath("//div[@class='header-btn']//button[@type='button']"));
	        loginRegisterButton.click();

	        // Step 3: Click on Login with Google button
	        WebElement googleLoginButton = driver.findElement(By.className("btn-google"));
	        googleLoginButton.click();

	        // You may need to switch to the Google login popup window here
	        // This depends on the behavior of the website

	        // Perform login in the Google popup window
	        // Fill in your Google account's email and password fields
	        WebElement emailField = driver.findElement(By.id("identifierId"));
	        emailField.sendKeys("your_google_email@gmail.com");

	        WebElement nextButton = driver.findElement(By.id("identifierNext"));
	        nextButton.click();

	        // Wait for a bit to allow the page to load
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Fill in your Google account's password
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("your_google_password");

	        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
	        passwordNextButton.click();

	        // Wait for a bit to allow the login to complete
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Now you're logged in!

	        // Close the browser
	       
	    }
	}
//div[@class='header-btn']//button[@type='button']