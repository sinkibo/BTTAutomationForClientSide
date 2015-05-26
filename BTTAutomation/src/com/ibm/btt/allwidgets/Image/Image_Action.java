package com.ibm.btt.allwidgets.Image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;

public class Image_Action extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Image_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Image_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.image_widget();
    drv.Image_action();
  }

  @Test
  public void Image_Action_focus(){
	  assertEquals("image is focus", drv.Image_Action_focus_getValue());
  }
  
  @Test
  public void Image_Action_styleClass(){
	  assertEquals(1, drv.Image_Action_styleClass());
  }
  
  @Test
  public void Image_Action_location(){
	  assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/Bomb1.jpg", drv.Image_Action_location());
  }
  
  @Test
  public void Image_Action_visibility(){
	  assertEquals(false, drv.Image_Action_visibility());
  }
  
  @Test
  public void Image_Action_disabled(){
	  assertEquals("image is disabled", drv.Image_Action_disabled());
  }
  
/*  @Test
  public void Image_Action_target(){
	  assertEquals(false, drv.Text_Action_hidden());
  }*/
  
  @Test
  public void Image_Action_alt(){
	  assertEquals("test alt", drv.Image_Action_alt());
	  assertEquals("location changes to  img/days.jpg", drv.Image_Action_alt_getvalue());
  }
  
  @Test
  public void Image_Action_hint(){
	  assertEquals("test hint", drv.Image_Action_hint());
  }
  
  @Test
  public void Image_Action_actionGroup(){
	  assertEquals(true, drv.Image_Action_actionGroup());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Image_Action.class);
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
