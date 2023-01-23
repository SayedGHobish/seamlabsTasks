package PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    public Actions action;
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  Actions act(WebElement element,WebElement locators)
    {
        Actions Hover = new Actions(driver);
        Hover.moveToElement(element).moveToElement(locators).click().build().perform();
        return Hover;
    }
}
