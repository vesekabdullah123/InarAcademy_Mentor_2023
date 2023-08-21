package Automations;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testcase_08 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://inar-academy.netlify.app/");
        driver.findElement(By.xpath("//a[normalize-space()='Target Market']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("problem_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_keyword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='splide59-slide03']//div[@class='nav-item']")));
            System.out.println("Element is clickable");
        } catch (Exception e) {
            System.out.println("Element isn't clickable");
        }
        driver.close();
    }
}
