package com.kodilla.selenium.allegro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        try {

            WebElement closeConsent = driver.findElement(By.xpath("//div[@class='_1yyhi']/div/button"));
            closeConsent.click();


            WebElement category = driver.findElement(By.xpath("//optgroup[@label='Kategorie']/option[3]"));
            category.click();

            WebElement inputField = driver.findElement(By.name("string"));
            inputField.sendKeys("mavic mini");

            WebElement inputField2 = driver.findElement(By.xpath("//form/button[text()='szukaj']"));
            inputField2.click();
        }
        catch (NoSuchElementException e) {
            System.err.println(e);
        }

    }
}
