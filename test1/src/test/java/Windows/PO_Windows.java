

package Windows;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Windows {
	WebDriver driver;
	
	public PO_Windows(WebDriver d) {
		this.driver = d;
	}
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")
	private WebElement btn_generate_Window;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[2]/button")
	private WebElement btn_generate_Window2;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[2]/div[3]/button")
	private WebElement btn_generate_Window3;
	
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")
	private WebElement btn_Window1;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
	private WebElement btn_Window2;
	
	@FindBy(how = How.XPATH, using= "/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
	private WebElement btn_Window3;
	
	

	
	public void setbtn_Window1() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		btn_Window1.click();
		btn_generate_Window.click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.close();
			}
		}	
		driver.switchTo().window(parentWindow);
	}
	

	
	public void setbtn_Window2() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		btn_Window2.click();
		btn_generate_Window2.click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				Thread.sleep(5000);
				driver.close();
			}
		}	
		driver.switchTo().window(parentWindow);
	}


	public void setbtn_Window3() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		btn_Window3.click();
		btn_generate_Window3.click();
		Thread.sleep(5000);
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				WebElement ele =  driver.findElement(By.id("email"));
				ele.sendKeys("hviyvyv");
				Thread.sleep(5000);
				driver.close();
				break;
			}
		}	
		driver.switchTo().window(parentWindow);
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