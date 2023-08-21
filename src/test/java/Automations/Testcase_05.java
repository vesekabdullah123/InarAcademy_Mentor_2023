package Automations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_05 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://inar-academy.netlify.app/");
        driver.findElement(By.xpath("//a[normalize-space()='Target Market']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_keyword");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.id("react-aria9225625726-3-tab-2")).click();
        driver.findElement(By.xpath("(//button[@class='btn btn-danger fs-3 w-100'][normalize-space()='Add to Cart'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='mx-3 position-relative d-flex justify-content-center align-items-center py-1 px-3 fs-3 btn-light btn text-danger']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Go to Checkout']")).click();
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Mauro");
        driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Icardi");
        driver.findElement(By.cssSelector("input[name='cardNumber']")).sendKeys("1234567891234567");
        driver.findElement(By.cssSelector("input[id='phoneNumber']")).sendKeys("1234567890");
        driver.findElement(By.xpath("(//button[normalize-space()='Place Order'])[1]")).click();
        String adressText=driver.findElement(By.xpath("//div[normalize-space()='Address is required']")).getText();
        Assert.assertEquals("Address is required",adressText);
        driver.close();
    }
}
