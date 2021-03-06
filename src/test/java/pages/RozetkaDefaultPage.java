package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Валерий on 05.08.2015.
 */
public class RozetkaDefaultPage extends TestBase {

    String URL= "http://rozetka.com.ua/";

    public RozetkaDefaultPage(WebDriver webDriver){
        this.webDriver = webDriver;
        open(URL);
        Assert.assertTrue(webDriver.getCurrentUrl().equals(URL));
    }

    public void enterToPrivateCabinet(){
        webDriver.findElement(By.xpath("//a[@href='https://my.rozetka.com.ua/signin/']")).click();
    }

    public void goToNoteBooksAndOthers(){
        webDriver.findElement(By.xpath("//a[@href='http://rozetka.com.ua/computers-notebooks/c80253/']")).click();
    }

}
