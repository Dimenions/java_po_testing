import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestSelenium {
    public static void main(String[] args) {
        // 3D1602270584696%253Ab29fe00b970daff5ad1e3e6815e6cfa5  - csrf
        System.setProperty("webdriver.opera.driver", "C:\\operadriver_win64\\operadriver.exe");
        OperaDriver driver = new OperaDriver();
    }

    @Test
    public static void Test_TMP_guru99_com() {
        System.setProperty("webdriver.opera.driver", "C:\\operadriver_win64\\operadriver.exe");
        OperaDriver driver = new OperaDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

        //List<WebElement> tds = driver.findElementsByClassName("accpage");
        List<WebElement> tds = driver.findElementsByTagName("td");

        boolean is_pass_equal = false;
        for (var item : tds) {
            if (item.getText().equals("mngr26593"))
                is_pass_equal = true;
            // System.out.println(item.getText());
        }
        Assert.assertTrue(is_pass_equal == true);
    }

    // TASK _ 1
    @Test
    public static void Yandex_Auth() {
        System.setProperty("webdriver.opera.driver", "C:\\operadriver_win64\\operadriver.exe");
        OperaDriver driver = new OperaDriver();
        driver.get("https://pokupki.market.yandex.ru");

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

//        WebElement user_ebalo2 = driver.findElementByClassName("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/div/div[2]/button/div/div[1]");

        WebElement fucking_cross = driver.findElementByClassName("_3GXTUxoi5r");
        fucking_cross.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement button_enter = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/a/button"));
        button_enter.click();
        // .sendKeys("abc@gmail.com");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]"));
        login.sendKeys("dsv53571@bcaoo.com");

        WebElement button_enter_auth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div/div[1]/form/div[3]/button"));
        button_enter_auth.click();

        WebElement password = driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]"));
        password.sendKeys("test123test");

        WebElement another_button_enter_auth_blyat_skolko_mozho_knopok = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div[1]/form/div[3]/button"));
        another_button_enter_auth_blyat_skolko_mozho_knopok.click();


        WebElement user_ebalo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/div/div[2]/button/div/div[1]"));

        Assert.assertNotNull(user_ebalo);
    }

    // TASK _ 2
    @Test
    public static void Yandex_Change_City() throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "C:\\operadriver_win64\\operadriver.exe");
        OperaDriver driver = new OperaDriver();
        driver.get("https://pokupki.market.yandex.ru");

        //driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

//        WebElement user_ebalo2 = driver.findElementByClassName("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/div/div[2]/button/div/div[1]");

        WebElement fucking_cross = driver.findElementByClassName("_3GXTUxoi5r");
        fucking_cross.click();

        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement city_changer_button = driver.findElementByClassName("_3PaKLyf5hk");
        city_changer_button.click();

        List<WebElement> city_choose = driver.findElementsByClassName("_2JDvXzYsUI");
        for (int i = 0; i < city_choose.size(); ++i) {
            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            System.out.println(city_choose.get(i).getText());
//            if(city_choose.get(i).getText().equals("Саратов")) { // В задании написан Саратов)
//                city_choose.get(i).click();
//                city_choose.get(i).clear();
//                city_choose.get(i).sendKeys("Хвалынск");
//            }
        }
        city_choose.get(1).click();
        for (int i = 0; i <10; i++){
            city_choose.get(1).sendKeys(Keys.BACK_SPACE);
        }
        city_choose.get(1).clear();
        city_choose.get(1).sendKeys("Хвалынск");

        //WebElement firstResult = new WebDriverWait(driver,10).until(ExpectedConditions.textToBe("Хвалынск").elementToBeClickable(By.xpath("//a/h3")));

        Thread.sleep(5000);

//        List<WebElement> cities = driver.findElementByClassName("Npw5Gq5EyL").findElement(By.partialLinkText("Хвалынск"));
        WebElement city = driver.findElement(By.id("react-autowhatever-region--item-0"));
        System.out.println(city.getText());
        city.click();
//        for(int i=0; i<cities.size(); ++i){
//            System.out.println(cities.get(i).getText());
//            System.out.println();
//            if(cities.get(i).getText().equals("Хвалынск")){
//                cities.get(i).findElement(By.id("react-autowhatever-region--item-0")).click();
//            }
//        }
        //cities.get(1).click();

//        WebElement gutten_tag = driver.findElement(By.xpath("html/body/div[14]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/button"));
        WebElement gutten_tag_xpath = driver.findElement(By.xpath("/html/body/div[14]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/button"));
        ///html/body/div[14]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/button
        gutten_tag_xpath.click();

        Thread.sleep(2000);


        //ВХОДИМ в Аккаунт
        WebElement button_enter = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/a/button"));
        button_enter.click();
        // .sendKeys("abc@gmail.com");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"passp-field-login\"]"));
        login.sendKeys("dsv53571@bcaoo.com");
        Thread.sleep(1000);

        WebElement button_enter_auth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div/div[1]/form/div[3]/button"));
        button_enter_auth.click();
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"passp-field-passwd\"]"));
        password.sendKeys("test123test");
        Thread.sleep(1000);

        WebElement another_button_enter_auth_blyat_skolko_mozho_knopok = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/div/div[1]/form/div[3]/button"));
        another_button_enter_auth_blyat_skolko_mozho_knopok.click();
        Thread.sleep(2000);

        WebElement user_ebalo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div[3]/div/div/div/div/div[2]/button/div/div[1]"));


        //Чекаем город
        WebElement is_city_xvalinsk = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]"));
        Assert.assertEquals(is_city_xvalinsk.getText(), "Ваш город — Хвалынск?");
        
    }
}