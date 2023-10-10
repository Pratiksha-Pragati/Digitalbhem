package webDriver;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.By;

		public class TC_Verify_data{
		//********Test Data
		        //DT     Var           VV
		static  String url      = ("http://183.82.103.245/nareshit/login.php");
		static  String username = "nareshit";
		static  String password = "nareshit";
		static  String title1   = "OrangeHRM - New Level of HR Management";
		static  String title2   = "OrangeHRM";
		 
		public static void main(String args[]) throws Exception{
		    //Test Steps
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(url);
		//Verify pageTitle
		//ActualTitle     compare  Expected.Title
		if(driver.getTitle().equals(title1)) {
		System.out.println("Title matched");
		}
		else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//Verify Title
		if(driver.getTitle().equals(title2)) {
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


