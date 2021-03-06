package com.ibm.btt.allwidgets.Radio;

import java.util.regex.Pattern;

import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ibm.btt.allwidgets.Label.Label_PageObject;
import com.ibm.btt.util.*;

public class Radio_CSS extends AllWidgetsProjectMain_Class{
  /*private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Radio_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Radio_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Radio_widget();
    drv.Radio_css();

  }
  
  @Test
  public void css_check1() throws InterruptedException{
	  String[] temp={"setFontSize"};
	  assertEquals(1,CSS.css_query(drv.Radio_css_style1_getAttribute(), temp));
  }
  
  @Test
  public void css_check2() throws InterruptedException{
	  String[] temp={"setColor", "setFontFamily"};
	  assertEquals(2,CSS.css_query(drv.Radio_css_style2_getAttribute(), temp));
  }
  
  @Test
  public void css_check3() throws InterruptedException{
	  String[] temp={"setFontWeight", "setFontStyle", "setFontSize"};
	  assertEquals(3,CSS.css_query(drv.Radio_css_style3_getAttribute(), temp));
  }
  
  @Test
  public void css_check4() throws InterruptedException{
	  String[] temp={"dijitIconConfigure"};
	  assertEquals(1,CSS.css_query(drv.Radio_css_style4_getAttribute(), temp));
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Radio_CSS.class);
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}