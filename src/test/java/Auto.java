import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {
    @Test
    public void pesquisarGoogle(){
        System.setProperty("webdriver.chrome.driver", "src\\Drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://google.com");
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Valor Dolar", Keys.ENTER);

    }
}
