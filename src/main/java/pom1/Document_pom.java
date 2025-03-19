// Document_pom.java
package pom1;

import Abstract.Abstract_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Document_pom extends Abstract_pom {
    private WebDriver driver;
    private final String BUTTON_TEXT = "Get paid ";
    private final By dynamicButtonLocator = By.xpath("//a[text()='" + BUTTON_TEXT + "']");

    @FindBy(xpath = "//a[text()='Get paid']")
    private WebElement btnGetPaid;

    @FindBy(xpath = "//span[text()='Free']/parent::div/preceding-sibling::div")
    private List<WebElement> freeDoc;

    @FindBy(xpath = "//span[contains(@class,'price-amount') and number(translate(text(),'$','')) > 30 and number(translate(text(),'$','')) < 60]/parent::div/preceding-sibling::div")
    private List<WebElement> priceDoc;

    private final By title = By.cssSelector(".step-title");

    public Document_pom(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGetPaid() {
        WaitForElement(dynamicButtonLocator);
        PerformClick(driver.findElement(dynamicButtonLocator));
    }

    public int GetFreeSize() {
        return freeDoc.size();
    }

    public List<String> getFreeList() {
        return getElementsText(freeDoc);
    }

    public void WaitTitle() {
        WaitForElement(title);
    }

    public int getPriceDocSize() {
        return priceDoc.size();
    }

    public List<String> getPriceDocList() {
        return getElementsText(priceDoc);
    }

    public By getPriceLocator(int minPrice, int maxPrice) {
        return By.xpath("//span[contains(@class,'price-amount') and number(translate(text(),'$',''))>"
                + minPrice + " and number(translate(text(),'$',''))<" + maxPrice + "]");
    }
}