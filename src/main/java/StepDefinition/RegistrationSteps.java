package StepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class RegistrationSteps {
	WebDriver driver;
	@Given("user is on Signup page")
	public void user_is_on_login_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\Users\\kirout\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://localhost:8080/FlyAway/signup");
		driver.manage().window().maximize();
	}
	@Given("user enter {string} in the Email id input")
	public void user_enter_in_the_email_id_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement username = driver.findElement(By.name("email_id"));
		username.sendKeys("kishan@gmail.com");
	}
	@Given("user enter {string} in the Password input")
	public void user_enter_in_the_password_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Pwd= driver.findElement(By.name("pwd"));
		Pwd.sendKeys("kkkkk");
	}
	@Given("user enter {string} in the Confirm Password input")
	public void user_enter_in_the_confirm_password_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Pwd2= driver.findElement(By.name("pwd2"));
		Pwd2.sendKeys("kkkkk");
	}
	@Given("user enter a {string} in the Name input")
	public void user_enter_a_in_the_name_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement name1= driver.findElement(By.name("name"));
		name1.sendKeys("kishan");
	}
	@Given("user enter {string} in the Address input")
	public void user_enter_in_the_address_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Adress= driver.findElement(By.name("address"));
		Adress.sendKeys("India");
	}
	@Given("user agree enter {string} in the City input")
	public void user_agree_enter_in_the_city_input(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement City= driver.findElement(By.name("city"));
		City.sendKeys("BBSR");
	}
	@Given("user click the {string} button")
	public void user_click_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Signup = driver.findElement(By.tagName("button"));
		Signup.click();
	}
	@Then("user should able to click on {string} button")
	public void user_should_able_to_click_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String expPage="Fly Away - Registration Confirmation";
		String strTitle = driver.getTitle();
		System.out.println(strTitle);
		String expPage1;
		if(expPage!=strTitle) {
			expPage1="Fly Away - Register";
			System.out.println("User already exist");
		}
		else {
			expPage1=expPage;
		}
		Assert.assertEquals(expPage1, strTitle);
		driver.close();
	}
}
