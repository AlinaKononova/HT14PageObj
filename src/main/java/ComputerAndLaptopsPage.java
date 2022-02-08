import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComputerAndLaptopsPage {
  By laptops = By.xpath("//div[@class='tile-cats']");

  private WebDriver driver;
  private WebDriverWait wait;

  public ComputerAndLaptopsPage(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
  }

  public SearchPage clickLaptops(){
    driver.findElement(laptops).click();
    return new SearchPage(driver, wait);
  }


}
