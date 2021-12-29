import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class driver {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SUPGT-ATV30916\\Documents\\chromedriver_win32\\chromedriver.exe");

//         Esse "ChromeOptions" foi usado para abrir o navegador já maximizado
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

//         Abre o Chrome acessando o sistema
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://web.germantech.com.br");

//         Procura o campo de e-mail e insere
        WebElement caixaEmail = driver.findElement(By.name("email"));
        caixaEmail.sendKeys ("germantech@germantech.com.br");

//         Procura o campo de senha e insere
        WebElement caixaSenha = driver.findElement(By.name("password"));
        caixaSenha.sendKeys ("q27pptz8");

//         Procura o botão e clica
        WebElement botaoLogin = driver.findElement(By.tagName("button"));
        botaoLogin.click();

//         Essa função faz com que o selenium espere até que um elemento esteja carregado para prosseguir
//         Sem essa espera, o carregamento não tem tempo suficiente de identificar o login

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("dropdown-basic")));
        System.out.println(firstResult.getText());

//         Após o tempo de espera, o navegador vai para a página de cadastro de produto
        driver.navigate().to("https://web.germantech.com.br/cadastros/produtos/novo");

//           Procura o campo de descrição de produto e insere
//        WebElement caixaDescricao = driver.findElement(By.name("descricao"));
//        caixaDescricao.sendKeys ("Teste Selenium 1");

//           Procura o campo de NCM e insere
//         WebElement caixaNCM = driver.findElement(By.id("ncm"));
//         caixaNCM.sendKeys ("99999999");



    }
}