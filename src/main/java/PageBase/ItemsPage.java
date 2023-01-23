package PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemsPage extends PageBase{
    public ItemsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/a")
    public WebElement secendOrder;
    @FindBy(xpath = "//*[@id=\"app-root\"]/div[2]/div[2]/div/section/div[2]/div[1]/div[2]/div/h3/div")
     public WebElement prouductPrices;

    @FindBy(className = "button-with-icon second-bg sm")
    public WebElement addToCart;


}
