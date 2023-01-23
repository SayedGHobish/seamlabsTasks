package BDD.Steps;

import BDD.Runner.TestBase;
import PageBase.PageBase;

import PageBase.HomePage;
import PageBase.ItemsPage;
import PageBase.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class UserStep extends TestBase {
    PageBase baseObj;
    HomePage homeObj;
    ItemsPage itemsObj;
    Checkout chechObj;
    @Given("the user in the home page")
    public void the_user_in_the_home_page() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

    }
    @When("User go to outDoors")
    public void user_go_to_out_doors() {
        baseObj = new PageBase(driver);
        homeObj = new HomePage(driver);
        baseObj.act(homeObj.FurnitureIcon, homeObj.outdoorsItems);
        String currentUrls =  driver.getCurrentUrl();
        Assert.assertEquals(currentUrls,"https://homzmart.com/en/c/outdoors?page=1");
    }
    @When("open the second order")
    public void add_order_to_card() {
        itemsObj = new ItemsPage(driver);
        itemsObj.secendOrder.click();

    }
    @Then("checkout the order")
    public void checkout_the_order() {
        chechObj = new Checkout(driver);
        itemsObj = new ItemsPage(driver);
        String productPricesText = itemsObj.prouductPrices.getText();
        itemsObj.addToCart.click();
        chechObj.checks();
        String totalPrices = chechObj.total.getText();
        Assert.assertEquals(totalPrices,productPricesText);
    }

}
