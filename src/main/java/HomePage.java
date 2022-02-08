import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
  By menuComputerAndLaptops = By.xpath("//a[@class='menu-categories__link']");

  private WebDriver driver;
  private WebDriverWait wait;

  public HomePage(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
  }

  public ComputerAndLaptopsPage clickComputersAndLaptops() {
    driver.findElement(menuComputerAndLaptops).click();
    return new ComputerAndLaptopsPage(driver, wait);
  }
}
