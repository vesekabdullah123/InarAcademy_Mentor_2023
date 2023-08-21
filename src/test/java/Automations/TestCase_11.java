package Automations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_11 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://inar-academy.netlify.app/");
        driver.findElement(By.xpath("//a[normalize-space()='Target Market']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_keyword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Logout'])[1]")).click();
        String welcomeText=driver.findElement(By.xpath("//p[@class='text-dark mb-2 text-center']")).getText();
        Assert.assertEquals("Welcome Target Market, please login",welcomeText);
        driver.close();
    }
}
