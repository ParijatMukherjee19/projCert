package com.edureka;

import java.io.IOException; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Main {

    public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--remote-debugging-port=9222");
                chromeOptions.addArguments("--no-sandbox");

             try{ 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("http://localhost:8090");
 
                Thread.sleep(1000);
                WebElement button = driver.findElement(By.id("About"));
                if(button.isDisplayed()){
                System.out.println("Button about is there: " + button.isDisplayed());
                }else{
                System.out.println("Fail");}
                driver.close();

                }catch (Exception ex)
                {
                  System.out.println("Exception occured ");
                }

}

}
