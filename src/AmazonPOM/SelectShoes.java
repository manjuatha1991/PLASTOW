package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectShoes {
    @FindBy(xpath="(//span[.='ASIAN'])[2]")
	private WebElement ele1;
    
    public SelectShoes(WebDriver driver){
    	PageFactory.initElements(driver,this);
    }
    public void selectAsShoes(){
    	ele1.click();
}
}