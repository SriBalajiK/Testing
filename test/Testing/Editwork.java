/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Gayatree
 */
public class Editwork {
    
    @Test
    public void WorkingwithDropdownList() {
        System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32_1\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://leafground.com/");
        WebElement editing=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));
        editing.click();
        WebElement emailadd=driver.findElement(By.id("email"));
        emailadd.sendKeys("balajisri25@gmail.com");
        System.out.println("Value Sent");
        WebElement append=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
        append.sendKeys("+ Sri Balaji");
        System.out.println("Value appended");
        WebElement defaulttext=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
        System.out.println("Default Test = "+ defaulttext.getAttribute("value"));
        WebElement clearing=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
        clearing.clear();
        System.out.println("Value Cleared");
        WebElement selected=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
        System.out.println("Selected Status = " + selected.isEnabled());
        driver.quit();
    }  
}
