package PageBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout extends PageBase{
    public Checkout(WebDriver driver) {
        super(driver);
    }

    @FindBy(id ="HEADER_CART_BRIEF_ICON")
    public WebElement  check;

    @FindBy(id ="HEADER_CART_BRIEF_GO_TO_CART_BUTTON")
    public WebElement  goToCart;

    @FindBy(xpath = "//*[@id=\"app-root\"]/div[2]/div[2]/div/div[1]/div[2]/div/div[3]/span[2]/b")
    public WebElement total;

    public void checks()
    {
        check.click();
        goToCart.click();
    }
}
