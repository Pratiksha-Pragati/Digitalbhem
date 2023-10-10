package webDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC001 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
ChromeDriver driver =new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Thread.sleep(3000);//wait stmt
driver.close();
	}

}
