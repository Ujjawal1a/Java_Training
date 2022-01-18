

package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Alert {
	WebDriver driver;
	
	public PO_Alert(WebDriver d) {
		this.driver = d;
	}
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[1]/button")
	private WebElement btn_generate_alert;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[2]/button")
	private WebElement btn_generate_alert2;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[3]/button")
	private WebElement btn_generate_alert3;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")
	private WebElement btn_alert1;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
	private WebElement btn_alert2;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
	private WebElement btn_alert3;

	

	
	public void setbtn_alert1() {
		System.out.println("1");
		btn_alert1.click();
		System.out.println("11");
		btn_generate_alert.click();
		System.out.println("111");
		Alert alert1 = driver.switchTo().alert();
		System.out.println("1111");
		alert1.accept();
	}

	
	public void setbtn_alert2() {
		btn_alert2.click();	
		btn_generate_alert2.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		}

	public void setbtn_alert3() {
		btn_alert3.click();
		btn_generate_alert3.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Hi, this is Ujjawal Tripathy");
		alert1.accept();
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