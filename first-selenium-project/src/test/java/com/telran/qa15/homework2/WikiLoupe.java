package com.telran.qa15.homework2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiLoupe extends WikiTest1 {

  @Test
  public void testOpeningJava(){
        wd.findElement(By.id("searchInput")).sendKeys("Java");
        wd.findElement(By.cssSelector("i.sprite.svg-search-icon")).click();

        String currentUrl = wd.getCurrentUrl();
        System.out.println(currentUrl);

        Assert.assertEquals(currentUrl,"https://ru.wikipedia.org/wiki/Java");
      }


}
