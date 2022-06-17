import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements WebUtil {

	public WebDriver driver;

	public WebDriver Start_Browser(String BrowserName) {
		System.out.println("Please Enter Browser name :" + BrowserName);

		if (BrowserName.equals(CHROME_BROWSER)) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (BrowserName.equals(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (BrowserName.equals(EDGE_BROWSER)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("please enter the correct browser name :" + BrowserName);
		}
		return driver;
	}

	@Override
	public void navigateURL(String url) {
		if (url == null) {
			return;

		}
		if (url.isEmpty()) {
			return;

		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {

			System.out.println("Please enter the correct Url missing http and https:");
			return;
		}

		driver.get(url);

	}

	@Override
	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void quitBrowser() {
		driver.quit();

	}

	@Override
	public String getpageTitle() {
		return driver.getTitle();

	}

}
