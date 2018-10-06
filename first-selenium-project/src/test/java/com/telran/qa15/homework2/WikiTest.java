package com.telran.qa15.homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WikiTest {
  WebDriver wd;

  @BeforeMethod
  public void setUp(){
    wd=new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);// чтобы страница браузера была открыта
    wd.quit();
  }
}
