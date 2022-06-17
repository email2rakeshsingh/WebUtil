
public class opencart {

	public static void main(String[] args) {
		BrowserUtil opencart = new BrowserUtil();
		opencart.Start_Browser("chrome");
		opencart.getCurrentUrl();
		opencart.navigateURL("https://demo.opencart.com/index.php?");
		String title = opencart.getpageTitle();
		System.out.println("title");

		if (title.contains("Your Store")) {
			System.out.println("Correct title ");

		} else {

			System.out.println("Incorrect title ");

		}
		//opencart.closeBrowser();
		//opencart.quitBrowser();
	}

	}


