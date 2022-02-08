import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

  By titleOfItemInShoppingCart = By.xpath("//a[@class='cart-product__title']");
  By shoppingCart = By.xpath("//button[contains(@class, 'header__button--active')]");

  private WebDriver driver;
  private WebDriverWait wait;

  public Cart(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
  }

  public String shoppingCartCountItems(){
    return driver.findElement(shoppingCart).getAttribute("innerText").trim();
  }

  public Cart clickShoppingCart(){
    driver.findElement(shoppingCart).click();
    return new Cart(driver, wait);
  }

  public String getTitleOfItemInShoppingCart(){
    return driver.findElement(titleOfItemInShoppingCart).getText().trim();
  }
}
