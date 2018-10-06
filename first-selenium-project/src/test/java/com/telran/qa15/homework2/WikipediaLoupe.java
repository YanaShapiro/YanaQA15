package com.telran.qa15.homework2;

import com.telran.qa15.lesson2.WikiHomePageTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikipediaLoupe extends WikiTest  {
  @Test
  public void openSiteTest(){
    wd.navigate().to("https://wikipedia.org");
    wd.findElement(By.id("searchInput")).sendKeys("Java");
    wd.findElement(By.cssSelector("i.sprite.svg-search-icon")).click();

    String currentUrl = wd.getCurrentUrl();
    System.out.println(currentUrl);


    Assert.assertEquals(currentUrl,"https://ru.wikipedia.org/wiki/Java");






  }


}
