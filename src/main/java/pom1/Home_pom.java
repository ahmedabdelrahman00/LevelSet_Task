// Home_pom.java
package pom1;

import Abstract.Abstract_pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_pom extends Abstract_pom {
    @FindBy(xpath = "//li[contains(@class,'ml-sm-05')]/child::a")
    private WebElement textHome;

    WebDriver driver;

    public Home_pom(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Navigate() {
        driver.get("https://www.levelset.com/");
    }

    public boolean DisplayedHome() {
        return isDisplayed(textHome);
    }
}
