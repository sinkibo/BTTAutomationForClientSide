package com.ibm.btt.allwidgets.Button;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Button_appearance1 extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Button_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Button_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Button_widget();
    drv.button_appearance1();
  }

  @Test
  public void Appearance1_1(){
	  assertEquals("", drv.Appearance1_1());
  }
  
  @Test
  public void Appearance1_2(){
	  assertEquals("height: 50px;", drv.Appearance1_2());
  }
  
  @Test
  public void Appearance1_3(){
	  assertEquals("width: 50px;", drv.Appearance1_3());
  }
  
  @Test
  public void Appearance1_4(){
	  assertEquals("height: 50px; width: 50px;", drv.Appearance1_4());
  }
  
  @Test
  public void Appearance1_5(){
	  assertEquals("dijitLabelBase dijitLabelWrap", drv.Appearance1_5());
  }
  
  @Test
  public void Appearance1_6(){
	  assertEquals("dijitLabelBase", drv.Appearance1_6());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Button_appearance1.class);
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