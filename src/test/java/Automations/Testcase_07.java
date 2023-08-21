package Automations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_07 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://inar-academy.netlify.app/");
        driver.findElement(By.xpath("//a[normalize-space()='Target Market']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("locked_out_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_keyword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        String lockedUserText=driver.findElement(By.id("username-error-alert")).getText();
        Assert.assertEquals("Your account is locked.",lockedUserText);
        driver.close();
    }
}
