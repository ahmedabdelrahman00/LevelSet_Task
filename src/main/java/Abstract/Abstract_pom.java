package Abstract;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class Abstract_pom {

    WebDriver driver;
    public Abstract_pom(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean isDisplayed(WebElement element)
    {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public void PerformClick(WebElement element)
    {
       element.click();
    }

    public void WaitForElemnt(By findBy)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public List<String> getElementsText(List<WebElement> elements){
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
