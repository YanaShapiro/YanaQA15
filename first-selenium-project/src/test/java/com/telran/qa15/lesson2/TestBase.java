package com.telran.qa15.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
  WebDriver wd;

  @BeforeMethod
  public void setUp() throws InterruptedException {
    wd=new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    wd.get("https://www.wikipedia.org/");
    Thread.sleep(5000);
  }

  @AfterMethod
  public void tearDown() {
    wd.quit();
  }


  public void findAndClickOnTheEnglishLink() {
    wd.findElement(By.id("js-link-box-en")).click();
  }


}
