package AmazonPOM;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
    @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement ele;
    
    @FindBy(xpath="//div[@class='nav-search-submit nav-sprite']")
	private WebElement ele1;
    
    public Search_Page(WebDriver driver){
    	PageFactory.initElements(driver,this);
    }
    public void SearchProduct(String productName){
    	ele.sendKeys(productName);
    
    }                        
    public void clickOnSearch(){
    	ele1.click();
    }
}
