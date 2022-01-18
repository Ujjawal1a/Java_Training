package Windows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_Windows {
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	}
	
	@Test
	public void vaidate_form() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html ");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		PO_Windows obj = PageFactory.initElements(driver, PO_Windows.class);
		
		obj.setbtn_Window1();
		System.out.println("111111111111111111111111111111111111111111111111");
		obj.setbtn_Window2();
		System.out.println("222222222222222222222222222222222222222222222222");
		obj.setbtn_Window3();
		System.out.println("333333333333333333333333333333333333333333333333");
		driver.quit();
		
	}
}


//
//System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
//String s = driver.getTitle();
//System.out.println(s);
//driver.get("http://demo.automationtesting.in/Register.html");
//driver.manage().window().maximize();
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