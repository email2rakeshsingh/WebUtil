
public class Amazon {

	public static void main(String[] args) {
		BrowserUtil Amazon = new BrowserUtil();
		Amazon.Start_Browser("chrome");
		Amazon.getCurrentUrl();
		Amazon.navigateURL("https://www.amazon.com/");
		String title = Amazon.getpageTitle();
		System.out.println("title");

		if (title.contains("Amazon")) {
			System.out.println("Correct title ");

		} else {

			System.out.println("Incorrect title ");

		}
		Amazon.closeBrowser();
		Amazon.quitBrowser();
	}

}
