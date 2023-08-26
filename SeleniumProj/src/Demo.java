import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\ACT\\OneDrive\\Desktop\\LearnmallAutomation\\SeleniumProj\\data\\ProjectDetails.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);

			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			String browser = prop.getProperty("Browser");
			String url = prop.getProperty("Url");

			if (browser != null && url != null) {
				driver.manage().window().maximize();
				driver.get(url);
			} else {
				System.out.println("Browser or URL properties not found.");
			}

			// Close the WebDriver when done
//			driver.quit();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}