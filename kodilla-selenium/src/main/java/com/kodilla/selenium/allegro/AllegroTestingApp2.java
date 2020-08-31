package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AllegroTestingApp2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        try {

            WebElement closeConsent = driver.findElement(By.cssSelector("._1yyhi > div > button"));
            closeConsent.click();


            WebElement category = driver.findElement(By.cssSelector("div > select > optgroup > option")); //nie wiem jak zapisać żeby brał trzeci z kolejności option
            category.click();

            WebElement inputField = driver.findElement(By.cssSelector("div > form > input"));
            inputField.sendKeys("mavic mini");

            WebElement inputField2 = driver.findElement(By.cssSelector("div > form > button"));
            inputField2.click();

            List<WebElement> productionCard = driver.findElements(By.cssSelector("._9c44d_378hD > section > article"));

            productionCard.get().getText(); //poproszę o wskazówki

        } catch (NoSuchElementException e) {
            System.err.println(e);
        }

    }
}

