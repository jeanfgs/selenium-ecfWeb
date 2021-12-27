import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class driver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUPGT-ATV30916\\Documents\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://web.germantech.com.br");

        WebElement caixaEmail = driver.findElement(By.name("email"));
        caixaEmail.sendKeys ("germantech@germantech.com.br");

        WebElement caixaSenha = driver.findElement(By.name("password"));
        caixaSenha.sendKeys ("q27pptz8");

        WebElement botaoLogin = driver.findElement(By.tagName("button"));
        botaoLogin.click();
        driver.navigate().to("https://web.germantech.com.br/cadastros/produtos/novo");

    }

}
