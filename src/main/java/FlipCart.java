
public class FlipCart {

	public static void main(String[] args) {

		BrowserUtil FlipCart = new BrowserUtil();
		FlipCart.Start_Browser("chrome");
		FlipCart.getCurrentUrl();
		FlipCart.navigateURL("https://www.flipkart.com/");
		String title = FlipCart.getpageTitle();
		System.out.println("title");

		if (title.contains("FlipCart")) {
			System.out.println("Correct title ");

		} else {

			System.out.println("Incorrect title ");

		}
		FlipCart.closeBrowser();
		FlipCart.quitBrowser();
	}
}
