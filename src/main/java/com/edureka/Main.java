package com.edureka;

import java.io.IOException;
import org.openqa.selenium.PageLoadStrategy; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.PrintWriter;
import java.io.StringWriter;


public class Main {

    public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--remote-debugging-port=9222");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
             try{ 
                WebDriver driver = new ChromeDriver(chromeOptions);
 
                driver.get("http://localhost:8090");
 
                Thread.sleep(1000);

                if (driver.getPageSource().contains("About Us")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }


                
                driver.close();

                }catch (Exception ex)
                {
                  System.out.println("Exception occured ");
                  StringWriter sw = new StringWriter();
                  ex.printStackTrace(new PrintWriter(sw));
                  String exceptionAsString = sw.toString();
                  System.out.println(exceptionAsString);
                }

}

}
