package PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
        action = new Actions(driver);
    }
    @FindBy(xpath = "//*[@id=\"HEADER_MENU_BAR_CATEGORY_0\"]/div/a")
    public WebElement FurnitureIcon;

    @FindBy(linkText = "Outdoors")
    public WebElement outdoorsItems;
//    public void selectOutDoorsItems()
//    {
//        action.moveToElement(FurnitureIcon).moveToElement(outdoorsItems).click().perform();
//    }
}
