package testingAmazon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonAutomation {
    WebDriver driver;

    @SuppressWarnings("deprecation")
	@BeforeEach
    public void setUp() throws MalformedURLException {
        // URL of the Hub
        String hubURL = "http://localhost:4444/wd/hub";
        
        // Set Desired Capabilities for browser and platform
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");  // Use "firefox", "edge", etc. as needed
        capabilities.setPlatform(Platform.WIN11);  // Can be "LINUX", "MAC", etc.

        // Initialize the Remote WebDriver with Selenium Grid Hub URL and Capabilities
        driver = new RemoteWebDriver(new URL(hubURL), capabilities);
    }

    @Test
    public void testGoogleSearch() {
        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());
    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}