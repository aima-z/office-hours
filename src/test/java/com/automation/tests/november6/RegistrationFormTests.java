package com.automation.tests.november6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFormTests {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        // Xpath methods: //*[text()='Home']
        //      //tag[contains(@attribute, 'Value')] or //*[contains(@attribute, 'Value')]


        driver.quit();

    }

}
