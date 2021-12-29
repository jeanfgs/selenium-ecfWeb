import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUPGT-ATV30916\\Documents\\chromedriver_win32\\chromedriver.exe");

        // Abre o Chrome acessando o sistema
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.germantech.com.br");

        // Procura o campo de e-mail e insere
        WebElement caixaEmail = driver.findElement(By.name("email"));
        caixaEmail.sendKeys ("germantech@germantech.com.br");

        // Procura o campo de senha e insere
        WebElement caixaSenha = driver.findElement(By.name("password"));
        caixaSenha.sendKeys ("q27pptz8");

        // Procura o botão e clica
        WebElement botaoLogin = driver.findElement(By.tagName("button"));
        botaoLogin.click();

        // Tentei navegar para outra página dentro do sistema, mas não carregou o login :(
        driver.navigate().to("https://web.germantech.com.br/cadastros/produtos/novo");

    }

}
