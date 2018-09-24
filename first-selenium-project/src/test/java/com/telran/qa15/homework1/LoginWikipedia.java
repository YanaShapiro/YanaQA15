package com.telran.qa15.homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginWikipedia {
  WebDriver wd;
  @BeforeMethod
  public void setUp(){
    wd=new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

  }
  @Test
  public void openSiteTest(){
    wd.navigate().to("https://en.wikipedia.org");
    wd.findElement(By.linkText("Log in")).click();
    wd.findElement(By.name("wpName")).sendKeys("gdyhgasga");
    wd.findElement(By.name("wpPassword")).sendKeys("dhghc");
    wd.findElement(By.name("wpRemember")).click();
    wd.findElement(By.id("wpLoginAttemp")).click();

  }
  @AfterMethod
  public void tearDown() throws InterruptedException {
    //Thread.sleep(2000);// чтобы страница браузера была открыта
    wd.quit();
  }

}
