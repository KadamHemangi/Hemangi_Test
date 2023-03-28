package Test_Package_1;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\Hemangi Kadam\\Pictures\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://product.hicare.in/");
		Thread.sleep(3000);
		//Launched successfully
		WebElement Account=driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a"));
		Account.click();
		Thread.sleep(3000);
		//Login Process
		WebElement Mobile_number=driver.findElement(By.id("user_mobile"));
		Mobile_number.click();
		WebElement Mobile_number_input=driver.findElement(By.id("user_mobile"));
		Mobile_number_input.sendKeys("9833425754");
		WebElement Send_OTP=driver.findElement(By.id("sendotp"));
		Send_OTP.click();
		WebElement Enter_OTP=driver.findElement(By.id("user_otp"));
		Enter_OTP.click();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP");
		String otp=sc.nextLine();
		sc.close();
		WebElement otp1=driver.findElement((By.id("user_otp")));
		otp1.sendKeys(otp);
	}

}
