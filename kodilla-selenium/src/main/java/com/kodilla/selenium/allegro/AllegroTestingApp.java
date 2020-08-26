package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement category = driver.findElement(By.xpath("//*[@novalidate action=\"/listing\"]/div/div/select/optgroup"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[@novalidate action=\"/listing\"]/input"));
        inputField.sendKeys("mavic mini");

        WebElement inputField2 = driver.findElement(By.xpath("//*[@type=\"/submit\""));
        inputField2.click();

    }
}
