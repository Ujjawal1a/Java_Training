

package Frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Frames {
	WebDriver driver;
	
	public PO_Frames(WebDriver d) {
		this.driver = d;
	}
	
	@FindBy(how = How.XPATH, using= "/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")
	private WebElement btn_generate_frame1;
	@FindBy(how = How.XPATH, using= "/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")
	private WebElement btn_generate_frame2;
	
	
	
	
	
	
	
}