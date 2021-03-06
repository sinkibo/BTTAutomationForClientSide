package com.ibm.btt.allwidgets.Text;

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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.LocateManager;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Text_Action extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Text_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Text_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Text_widget();
    drv.Text_action();
  }
  
  LocateManager lm = new LocateManager();

  @Test
  public void Text_Action_focus(){
	  assertEquals(true, drv.Text_Action_focus());
  }
  
  @Test
  public void Text_Action_showErrorMessage(){
	  
	  assertEquals(lm.getNLSValue("bttsample","client_greetings"), drv.Text_Action_showErrorMessage());
  }
  
  @Test
  public void Text_Action_styleClass(){
	  assertEquals(1, drv.Text_Action_styleClass());
  }
  
  @Test
  public void Text_Action_value(){
	  assertEquals("yes", drv.Text_Action_value());
  }
  
  @Test
  public void Text_Action_isMandatory(){
	  assertEquals("This value is required.", drv.Text_Action_isMandatory());
  }
  
  @Test
  public void Text_Action_hidden(){
	  assertEquals(false, drv.Text_Action_hidden());
  }
  
  @Test
  public void Text_Action_disabledTrue(){
	  assertEquals("true", drv.Text_Action_disabledTrue());
  }
  
  @Test
  public void Text_Action_readOnlyTrue(){
	  assertEquals("true", drv.Text_Action_readOnlyTrue());
  }
  
  @Test
  public void Text_Action_hint(){
	  assertEquals("Widgets Test Case", drv.Text_Action_hint());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Text_Action.class);
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
