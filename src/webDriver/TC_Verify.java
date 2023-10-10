package webDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Verify {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//Verify pageTitle
		//ActualTitle     compare  Expected.Title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("Title matched");    
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
	}
	}


