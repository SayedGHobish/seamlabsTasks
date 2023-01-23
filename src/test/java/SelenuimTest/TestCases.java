package SelenuimTest;

import PageBase.HomePage;
import PageBase.ItemsPage;
import PageBase.PageBase;
import org.testng.Assert;
import PageBase.Checkout;
import org.testng.annotations.Test;

public class TestCases extends TestBais {
    PageBase baseObj;
    HomePage homeObj;
    ItemsPage itemsobj;
    Checkout checkObj;

    @Test
    public void navigateOutDoors()
    {
        baseObj = new PageBase(driver);
        homeObj = new HomePage(driver);
        baseObj.act(homeObj.FurnitureIcon, homeObj.outdoorsItems);
        String currentUrls =  driver.getCurrentUrl();
        Assert.assertEquals(currentUrls,"https://homzmart.com/en/c/outdoors?page=1");
    }

    @Test
    public void openSecondOrder()
    {
        itemsobj = new ItemsPage(driver);
        itemsobj.secendOrder.click();

    }

    @Test
    public void checkOut()
    {
        checkObj = new Checkout(driver);
        itemsobj = new ItemsPage(driver);
        String productPricesText = itemsobj.prouductPrices.getText();
        itemsobj.addToCart.click();
        checkObj.checks();
        String totalPrices = checkObj.total.getText();
        Assert.assertEquals(totalPrices,productPricesText);
    }

}
