package by.http.tstng.tstng_study;

public class JustWaits {

	WebDriver driver = new FirefoxDriver();driver.get("http://someurl");
	// ждем до 10 секунд
	WebElement explicitWait = (new WebDriverWait(driver, 10))
			// или пока не появился элемент с id=bar
			.until(ExpectedConditions.presenceOfElementLocated(By.id("bar")));

	##################################

	WebDriverWait wait = new WebDriverWait(WebDriverRefrence, 20);
	WebElement aboutMe;aboutMe=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));

	##################################

	// create the id locator for the searchBox element
	By searchBoxId = By.id("search-box");

	// create the wait object
	WebDriverWait wait = new WebDriverWait(driver, 10);

	// find the searchBox element and save it in the WebElement variable
	WebElement searchBoxElement = wait.until(ExpectedConditions.elementToBeClickable(searchBoxId));

	// type in the searchBox element
	searchBoxElement.click();searchBoxElement.clear();searchBoxElement.sendKeys("java");

}
