package core;

import static org.junit.Assert.fail;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class CommonsBasePage extends DriverFactory {

	private WebDriverWait wait = new WebDriverWait(getDRIVER(), 8);
	private static PointOption point = new PointOption();

	public void validateElementAppeared(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public String getText(By by) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by)).getText();
	}

	public void clickField(By by){
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
	}

	protected void clickAndFillField(By by, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);
		getDRIVER().hideKeyboard();
	}

}