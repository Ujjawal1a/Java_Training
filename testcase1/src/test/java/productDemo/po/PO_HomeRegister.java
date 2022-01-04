package productDemo.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_HomeRegister {
	WebDriver driver;
	
	public PO_HomeRegister(WebDriver d) {
		this.driver = d;
	}
	
	@FindBy(how = How.XPATH, using= "/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")
	private WebElement txtbx_firstname;
	
	@FindBy(how = How.XPATH, using= "/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")
	private WebElement txtbx_lastname;
	
	@FindBy(how = How.XPATH, using= "/html/body/section/div/div/div[2]/form/div[2]/div/textarea")
	private WebElement txtbx_address;

	

	public void setTxtbx_firstname(String args) {
		txtbx_firstname.sendKeys(args);
	}

	
	public void setTxtbx_lastname(String args) {
		txtbx_lastname.sendKeys(args);	
		}

	public void setTxtbx_address(String args) {
		txtbx_address.sendKeys(args);
		}
}
