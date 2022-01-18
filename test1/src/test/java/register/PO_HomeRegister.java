

package register;

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




//WebElement ele =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
//ele.sendKeys("hviyvyv");
//Thread.sleep(1000);
//WebElement ele1 =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
//ele1.sendKeys("hviyvyv");
//Thread.sleep(1000);
//WebElement add = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
//add.sendKeys("Bangalore");
//Thread.sleep(1000);
//WebElement email = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
//email.sendKeys("ajgvg@cgv.com");
//Thread.sleep(1000);
//WebElement phone =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
//phone.sendKeys("9869597152");
//Thread.sleep(1000);
//WebElement radio =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input"));
//radio.click();
//Thread.sleep(1000);
//WebElement checkbox = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input"));
//checkbox.click();
//Thread.sleep(1000);
//WebElement password1 =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input"));
//password1.sendKeys("hviyvyv");
//Thread.sleep(1000);
//WebElement password2 =  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input"));
//password2.sendKeys("hviyvyv");
//Thread.sleep(1000);
//WebElement submit = driver.findElement(By.name("signup"));
//submit.click();