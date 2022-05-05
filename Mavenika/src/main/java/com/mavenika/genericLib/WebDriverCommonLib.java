package com.mavenika.genericLib;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib {

	public String getPageTitle() {
		String title = BaseTest.driver.getTitle();
		return title;
	}

	public void verify(String expected, String actual, String page) {
		if (actual.equals(expected)) {
			System.out.println(page + " is Displayed, PASS");
		} else {
			System.out.println(page + " is not Displayed, FAIL");
		}

	}

	public void waitForPageTitle(String title) {
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}

	public void selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectedOption(String text, WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void switchToFrame(int index) {
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchToAlert() {
		BaseTest.driver.switchTo().alert();
	}
	public void acceptAlert() {
		BaseTest.driver.switchTo().alert().accept();
	}
	public void dissmissAlert() {
		BaseTest.driver.switchTo().alert().dismiss();
	}

	public void mouseHover(WebElement element) {
		Actions ac = new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}

	public void rightClick(WebElement element) {
		Actions ac = new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}

	public void getFullScreenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) BaseTest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void executeJavaScript(String script) {
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;
		jse.executeScript(script);
	}

	public void elementDisplayed(WebElement element, String elementName) {
		if (element.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log(elementName + " is Displayed", true);
		} else {
			Reporter.log(elementName + " is not Displayed", true);
			Assert.assertTrue(false);
		}
	}

	public void switchToWindow(WebElement element, String expectedTitle) throws InterruptedException, Throwable {

		Set<String> allwhs = BaseTest.driver.getWindowHandles();
		for (String wh : allwhs) {
			String actualTitle = BaseTest.driver.switchTo().window(wh).getTitle();
			if (actualTitle.contains(expectedTitle)) {

				Thread.sleep(2000);
				element.click();
				break;
			} else {
				System.out.println("title is not found");
			}
		}
	}

	public Set<String> getAllWindows()
	{
		Set<String> allwhs = BaseTest.driver.getWindowHandles();
		return allwhs;
	}
	
	public void switchToParentWindow(Set<String> allwhs, String parentTitle) {
		for (String wh : allwhs) {
			String actualTitle = BaseTest.driver.switchTo().window(wh).getTitle();
			if (actualTitle.contains(parentTitle)) {
				break;
			} else {
				System.out.println("title is not found");
			}
		}
	}

}
