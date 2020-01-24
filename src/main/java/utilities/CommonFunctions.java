package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;

public class CommonFunctions extends Base {
	public CommonFunctions(WebDriver dr) {
		
	}
	
	public static void checkDropdownOptionsAvailable(WebElement we, String[] expectedValues) throws Exception {
		try {
			Boolean result = true;
			List<WebElement> options = we.findElements(By.xpath(".//option"));
			int index = 0;
			
			for (WebElement option: options) {
				if (!option.getText().equals(expectedValues[index])) {
					result = false;
					
					break;
				}
				
				index = index + 1;
			}
			
			Assert.assertTrue(result);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkFeedbackMessageDisplayedContainsString(String feedbackMessage) throws Exception {
		try {
			WebElement we = driver.findElement(By.xpath("//span[contains(text(), '" + feedbackMessage + "')]"));
			
			waitElementVisibility(we);
			Assert.assertTrue(we.isDisplayed());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkFeedbackMessageDisplayedEqualsToString(String feedbackMessage) throws Exception {
		try {
			WebElement we = driver.findElement(By.xpath("//span[text() = '" + feedbackMessage + "']"));
			
			waitElementVisibility(we);
			Assert.assertTrue(we.isDisplayed());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkFeedbackMessageHidden(String feedbackMessage) throws Exception {
		try {
			WebElement we = driver.findElement(By.xpath("//span[text() = '" + feedbackMessage + "']"));
			
			Assert.assertTrue(!we.isDisplayed());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkIfCheckboxIsNotToggled(WebElement we) throws Exception {
		try {
			waitElementVisibility(we);
			waitElementNotSelected(we);
			Assert.assertTrue(!we.isSelected());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkIfCheckboxIsToggled(WebElement we) throws Exception {
		try {
			waitElementVisibility(we);
			waitElementSelected(we);
			Assert.assertTrue(we.isSelected());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkPopUpMessageDisplayed(String expectedPopUpMessage) throws Exception {
		try {
			String popUpMessage = driver.switchTo().alert().getText();
			
			Assert.assertTrue(popUpMessage.contains(expectedPopUpMessage));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkPopUpNotDisplayed() throws Exception {
		try {
			Boolean alertIsPresent = false;
			
			if (new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()) == null) {
				System.out.println("Pop up is not displayed.");
				
				alertIsPresent = true;
			}
			else {
				System.out.println("Pop up is displayed.");
			}
			
			Assert.assertTrue(alertIsPresent);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkPageTitle(String expectedTitle) throws Exception {
		try {
			waitTitleIs(expectedTitle);
			Assert.assertEquals(driver.getTitle(), expectedTitle);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void checkSingleSelectDropdownSelectedOption(WebElement we, String expectedValue) throws Exception {
		try {
			Boolean result = true;
			Select dropdown = new Select(we);
			WebElement selectedOption = dropdown.getFirstSelectedOption();
			String selectedOptionText = selectedOption.getText();
			
			if (!selectedOptionText.equals(expectedValue)) {
				result = false;
			}
			
			Assert.assertTrue(result);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void clearThenEnterElementValue(WebElement we, String value) throws Exception {
		try {
			waitElementClickable(we);
			we.clear();
			pause(1000, false);
			enterElementValue(we, value);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void clickElement(WebElement we) throws Exception {
		try {
			waitElementClickable(we);
			we.click();
			pause(2500, false); // REMOVE?
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void clickKeys(String keys) throws Exception {
		try {
			Actions action = new Actions(driver);
			
			action.sendKeys(keys).perform();
			pause(2500, false); // REMOVE?
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void clickOnPopUp(String option) throws Exception {
		try {
			if (option.equals("OK")) {
				driver.switchTo().alert().accept();
			}
			
			if (option.equals("Cancel")) {
				driver.switchTo().alert().dismiss();
			}
			
			if (option.equals("Leave")) {
				driver.switchTo().alert().accept();
			}
			
			pause(2500, false); // REMOVE?
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void doubleClickOnElement(WebElement we) throws Exception {
		try {
			waitElementClickable(we);
			
			Actions action = new Actions(driver).doubleClick(we);
			
			action.build().perform();
			pause(2500, false); // REMOVE?
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementAttributeContains(WebElement we, String attribute, String expectedValue) throws Exception {
		try {
			Assert.assertTrue(we.getAttribute(attribute).toString().contains(expectedValue));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementAttributeDoesNotContains(WebElement we, String attribute, String value) throws Exception {
		try {
			Assert.assertTrue(!we.getAttribute(attribute).toString().contains(value));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementAttributeEqualsTo(WebElement we, String attribute, String expectedValue) throws Exception {
		try {
			waitAttributeContains(we, attribute, expectedValue);
			Assert.assertTrue(we.getAttribute(attribute).equals(expectedValue));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementAttributeDoesNotEqualsTo(WebElement we, String attribute, String value) throws Exception {
		try {
			Assert.assertTrue(!we.getAttribute(attribute).equals(value));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementCssValueContains(WebElement we, String property, String expectedValue) throws Exception {
		try {
			Assert.assertTrue(we.getCssValue(property).contains(expectedValue));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementContainsText(WebElement we, String text) throws Exception {
		try {
			Assert.assertTrue(we.getText().toLowerCase().contains(text.toLowerCase()));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementDisplayed(WebElement we) throws Exception {
		try {
			waitElementVisibility(we);
			Assert.assertTrue(we.isDisplayed());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementEnabled(WebElement we) throws Exception {
		try {
			Assert.assertTrue(we.isEnabled());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementInvisible(WebElement we) throws Exception {
		try {
			waitElementInvisible(we);
			Assert.assertTrue(!we.isDisplayed());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementNotExistingByXPath(String xPath) throws Exception {
		try {
			List<WebElement> wes = driver.findElements(By.xpath(xPath));
			Assert.assertTrue(wes.size() == 0);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void elementTooltip(WebElement we, String value) throws Exception {
		try {
			waitElementVisibility(we);
			Assert.assertTrue(we.getAttribute("title").contains(value));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void enterElementValue(WebElement we, String value) throws Exception {
		try {
			waitElementClickable(we);
			
			for (int i = 0; i < value.length(); i++) {
				we.sendKeys(value.substring(i, i + 1));
				pause(50, false);
			}
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void hoverElement(WebElement we) throws Exception {
		try {
			waitElementVisibility(we);
			
			Actions action = new Actions(driver);
			
			action.moveToElement(we).build().perform();
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void pause(Integer duration, Boolean isMinutes) throws Exception {
		try {
			if (isMinutes) {
				duration = duration * 60000;
			}
			
			Thread.sleep(duration);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void screenshotFailedTest(Scenario scenario) throws Exception {
		try {
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File fileSource = ts.getScreenshotAs(OutputType.FILE);
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat sdtf = new SimpleDateFormat("MM.dd.yyyy_HHmm");
				
				FileUtils.copyFile(fileSource, new File("target/failedscreenshots/" + scenario.getName().substring(0, scenario.getName().indexOf(":")) + "-" + sdtf.format(calendar.getTime()) + ".png"));
			}
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void scrollToBottom() throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,0)");
			clickKeys(Keys.chord(Keys.CONTROL, Keys.END));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void scrollToElement(WebElement we) throws Exception {
		try {
			Actions action = new Actions(driver);
			
			action.moveToElement(we).perform();
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void scrollToTop() throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollTo(0,0)");
			clickKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void selectValueFromDropdown(WebElement we, String value) throws Exception {
		try {
			waitElementClickable(we);
			
			Select dropdown = new Select(we);
			
			dropdown.selectByVisibleText(value);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void switchFrameByXPath(String xPath) throws Exception {
		try {
			pause(2500, false); // REMOVE?
			
			Integer numberOfFrames = driver.findElements(By.tagName("iframe")).size();
			
			for (int i = 0; i <= numberOfFrames; i++) {
				driver.switchTo().frame(i);
				
				if (driver.findElements(By.xpath(xPath)).size() > 0) {
					break;
				}
				else {
					driver.switchTo().parentFrame();
				}
			}
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void textHiddenInPage(String value) throws Exception {
		try {
			Boolean textHidden = true;
			List<WebElement> wes = driver.findElements(By.xpath("//*[contains(text(), '" + value + "')]"));
			
			for (int i = 1; i <= wes.size(); i++) {
				WebElement we = wes.get(i - 1);
				
				if (we.isDisplayed()) {
					textHidden = false;
					
					break;
				}
			}
			
			Assert.assertTrue(textHidden);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void textVisibleInPage(String value) throws Exception {
		try {
			Boolean textVisible = false;
			String xPath = "//*[contains(text(), '" + value + "')]";
			List<WebElement> wes = driver.findElements(By.xpath(xPath));
			
			waitPresenceOfElement(xPath);
			
			for (int i = 1; i <= wes.size(); i++) {
				WebElement we = wes.get(i - 1);
				
				if (we.isDisplayed()) {
					textVisible = true;
					
					break;
				}
			}
			
			Assert.assertTrue(textVisible);
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	// Helper Functions - Start
	public static int getElementCountByXPath(String xPath) throws Exception {
		int elementCount = 0;
		
		try {
			List<WebElement> wes = driver.findElements(By.xpath(xPath));
			elementCount = wes.size();
		}
		catch (Exception e) {
			throw new Exception();
		}
		
		return elementCount;
	}
	
	public static String getElementXPath(WebElement we) throws Exception {
		String xPath = "";
		
		try {
			xPath = we.toString().substring(we.toString().indexOf("xpath:") + 7);
		}
		catch (Exception e) {
			throw new Exception();
		}
		
		return xPath;
	}
	
	public static String stringAppendDateTime(String value) throws Exception {
		String result = "";
		
		try {
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("_MMddyy_HHmm");
			result = value + sdf.format(calendar.getTime());
		}
		catch (Exception e) {
			throw new Exception();
		}
		
		return result;
	}
	
	public static WebElement getLastElementInListByXPath(String xPath) throws Exception {
		WebElement we = null;
		
		try {
			List<WebElement> wes = driver.findElements(By.xpath(xPath));
			we = wes.get(wes.size() - 1);
		}
		catch (Exception e) {
			throw new Exception();
		}
		
		return we;
	}
	// Helper Functions - End
	
	// Wait Functions - Start
	public static void waitAlertIsPresent() throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.alertIsPresent());
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitAttributeContains(WebElement we, String attribute, String value) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.attributeContains(we, attribute, value));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementClickable(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(we));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementInvisible(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(we)));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementNotClickable(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(we)));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementNotSelected(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.elementSelectionStateToBe(we, false));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementSelected(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.elementSelectionStateToBe(we, true));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitElementVisibility(WebElement we) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(we));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitPresenceOfElement(String xPath) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xPath)));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitTextToBePresentInElement(WebElement we, String text) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.textToBePresentInElement(we, text));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	
	public static void waitTitleIs(String title) throws Exception {
		try {
			new WebDriverWait(driver, 60).until(ExpectedConditions.titleIs(title));
		}
		catch (Exception e) {
			throw new Exception();
		}
	}
	// Wait Functions - End
}