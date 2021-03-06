package com.ibm.btt.allwidgets.TextArea;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class TextArea_event extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static TextArea_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, TextArea_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.TextArea_widget();
    drv.TextArea_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals("test onClick", drv.evtOnClick());
  }
  
  @Test
  public void evtOnFocus(){
	  assertEquals("test onFocus", drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("test onBlur", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("test onKeyDown", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("test onKeyPress", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals("test onKeyUp", drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("test onMouseDown", drv.evtOnMouseDown());
  }
   
  @Test
  public void evtOnMouseUp(){
	  assertEquals("test onMouseUp", drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("test onMouseEnter", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals("test onMouseLeave", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("test onMouseMove", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnChange(){
	  assertEquals("test onChange", drv.evtOnChange());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,TextArea_event.class);
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
