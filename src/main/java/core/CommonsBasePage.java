package core;

import static org.junit.Assert.fail;

import io.appium.java_client.touch.offset.PointOption;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.openqa.selenium.*;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xwpf.usermodel.XWPFDocument;


public class CommonsBasePage extends DriverFactory {

	private WebDriverWait wait = new WebDriverWait(getDRIVER(), 10);
	private static PointOption point = new PointOption();

	public void clickField(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
		} catch (NoSuchElementException e) {
			fail("it wasn't possible click field: " + e.toString());
		}

	}

	public void validateElementAppeared(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (NoSuchElementException e) {
			fail("The element" + by + "didn't appeared " + e.toString());
		}
	}

	protected void clickAndFillField(By by, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(text);
			getDRIVER().hideKeyboard();
		} catch (Exception e) {
			fail("It wasn't possible to click and fill the field with text " + e.toString());
		}

	}
}