package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObjectPage {
    public static WebDriver driver;


    public By loginButton = By.xpath("((//button[normalize-space()='Login'])[1]");
    public By emailTextField = By.xpath("(//input[@placeholder='Username'])[1]");
    public By passwordTextField = By.xpath("(//input[@placeholder='Password'])[1]");


    public  By leaveMenu = By.xpath("(//a[@class='oxd-main-menu-item active'])[1]");



}
