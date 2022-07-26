package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import dev.failsafe.Timeout;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

@RestController
@CrossOrigin(origins = "*")
public class SeleniumController {

	
	@GetMapping("/")
	public String getEmployees() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 //ebay automation
        String baseUrl = "https://www.ebay.com/";
		//driver.manage().timeouts().pageLoadTimeout(time:40, TimeUnit.SECONDS);
		driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.print("Sagar____"+actualTitle);
        
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Rich dad and poor dad");
        WebElement searchIcon =  driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchIcon.click();
        
        
        //google search automation
		WebDriver driver1 = new ChromeDriver();
        String baseUrl1 = "https://www.google.com/";
        driver1.get(baseUrl1);
       // WebElement m= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")); -> absolute path
        WebElement m =driver1.findElement(By.xpath("//input[@class='gLFyf gsfi']")); // relative path
        m.sendKeys("sagar");
        m.sendKeys(Keys.ENTER); // can also use Keys.RETURN
        
        
        //driver.quit();
        //driver1.quit();
        
        return "Selenium Project is running";
        
        
        
        
          		
	}
		
}
