import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataTest extends ScripeBase {
	
	@Test(dataProvider = "loginDatas", dataProviderClass=OperationTestData.class)
	
	public void test1(String username, String password){
		gotoLoginPage();
		inputUsrname(username);
		inputPassword(password);
		clickloginButton();
	}
	
	public void gotoLoginPage(){
		driver.navigate().to("https://www.freecrm.com");
	}
	
	public void inputUsrname(String username){
		WebElement usernameTexBox = driver.findElement(By.name("username"));
		usernameTexBox.sendKeys(username);
	}
	
	public void inputPassword(String password){
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		passwordTextBox.sendKeys(password);
	}
	
	public void clickloginButton(){
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
	}

}
