package com.B30G03.pages;


import com.B30G03.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

      public BasePage() {
          PageFactory.initElements(Driver.getDriver(), this);
      }

      public void clickMenuByText(String text){
          String locator="(//a[contains(.,'"+text+"')])[1]";
          WebElement element = Driver.getDriver().findElement(By.xpath(locator));
          element.click();
      }
}
