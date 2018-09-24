package com.telran.qa15.homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenEdgeTest {
  WebDriver wd;

  @BeforeMethod
  public void setUp() {
    wd = new EdgeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

  }

  @Test
  public void openSiteTest() {
    wd.navigate().to("https://yandex.ru/");
  }

  @AfterMethod
  public void tearDown() throws InterruptedException {
    //Thread.sleep(2000);// чтобы страница браузера была открыта
    wd.quit();
  }
}