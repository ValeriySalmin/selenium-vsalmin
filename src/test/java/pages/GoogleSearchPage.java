package pages;

import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by selenium on 29.07.2015.
 */
public class GoogleSearchPage extends TestBase{

    private WebElement searchField;
    private WebElement searchLink;

    public GoogleSearchPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public  void open(String URL){
        webDriver.get(URL);
    }

    public void searchText(String searchText){
        searchField = webDriver.findElement(By.id("lst-ib"));
        searchField.sendKeys(searchText);
    }

    public WebElement findURLElement(){
        searchLink = webDriver.findElement(By.xpath("//a[contains(@href,'selenium') and contains(text(),'selenium')]"));
        return searchLink;
    }
}
