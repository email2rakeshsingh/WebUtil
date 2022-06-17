
public interface WebUtil {

	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "Firefox";
	String EDGE_BROWSER = "edge";

	public void navigateURL(String url);

	public String getpageTitle();

	public String getCurrentUrl();

	public String getPageSource();

	public void closeBrowser();

	public void quitBrowser();

}
