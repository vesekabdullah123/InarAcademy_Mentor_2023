package Automations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_09 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://inar-academy.netlify.app/");
        driver.findElement(By.xpath("//a[normalize-space()='Target Market']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_keyword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.id("react-aria468527229-2-tab-2")).click();
        driver.findElement(By.xpath("//div[@id='target-market-item__3']//button[@class='btn btn-danger fs-3 w-100'][normalize-space()='Add to Cart']")).click();
        driver.findElement(By.xpath("//button[@class='mx-3 position-relative d-flex justify-content-center align-items-center py-1 px-3 fs-3 btn-light btn text-danger']")).click();
        String emptyText=driver.findElement(By.xpath("//p[@class='fs-4']")).getText();
        Assert.assertEquals("Your cart is empty.",emptyText);
        driver.close();
    }
}
