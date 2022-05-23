import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.awt.*;
import java.security.Key;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseStep extends BaseTest {

    @Step("<second> kadar bekle")
    public void waitForsecond(int second) throws InterruptedException {
        Thread.sleep(1000 * second);
    }

    @Step("<Key> Id'li elemente tıkla")
    public void clickElementByid(String Key) {
        appiumDriver.findElement(By.id(Key)).click();
        logger.info(Key + "Elemente tiklanir.");

    }

    @Step("<Key> Id'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByid(String Key, String keywordc) {
        appiumDriver.findElement(By.id(Key)).sendKeys(keywordc);
        logger.info(keywordc + "Degeri yazilir.");

    }
    @Step("<Key> Id'li elementin sayfada olup olmadığını kontrol et")
    public void isDisplayed(String Key){
        Assert.assertTrue(Key, appiumDriver.findElement(By.id(Key)).isDisplayed());
        logger.info(Key + "Elementi sayfada mevcut.");

    }

    @Step("<Key> xpath'li elemente tıkla")
    public void clickElementByxpath(String Key) {
        appiumDriver.findElement(By.xpath(Key)).click();
        logger.info(Key + "Elemente tıkla.");

    }

    @Step("<Key> xpath'li elementi bul ve <keyword> degerini iceriyor mu kontrol et")
    public void textControl(String key,String keyword){
        Assert.assertTrue("Element bulundu",appiumDriver.findElement(By.xpath(key)).getText().equals(keyword));
        logger.info(keyword + "Degerini icerir.");

    }

    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key, String keywordc) {
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keywordc);
        logger.info(keywordc + "Degeri yazilir");

    }

    @Step("Geri Butonuna Tıkla")
    public void goBack(){
        MobileElement backspace = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/ivBack"));
        backspace.click();
        logger.info("Geri Butonuna 2 Defa Tıklanır.");
    }

    @Step("<Key> Id'li elementi bul ve <keyword> degerini iceriyor mu kontrol et")
    public void textControlling(String key,String keyword){
        Assert.assertTrue("Element bulundu.",appiumDriver.findElement(By.id(key)).getText().equals(keyword));
    }

    @Step("Sayfayı aşağı doğru kaydır")
    public void swipeDown(){
        int x0 = 1068, y0 = 1262, x1 = 1068, y1 = 374;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.press(PointOption.point(x0,x1)).moveTo(PointOption.point(x1,y1)).release().perform();
        logger.info("Aşagi kaydirma islemi yapilir.");

    }

    @Step("Rastgele product secimi yap")
    public void selectProductRandom(){
        List <MobileElement> pantolon = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random random = new Random();
        int selectRandomInt = 0;
        selectRandomInt = random.nextInt(pantolon.size());
        pantolon.get(selectRandomInt).click();
        logger.info("Rastgele ürün secilir.");

    }

    @Step("Rastgele beden secimi yap")
    public void selectSizeRandom(){
        List <MobileElement> size = appiumDriver.findElements(By.id("com.ozdilek.ozdilekteyim:id/recyclerSizeList"));
        Random random = new Random();
        int selectRandomInt = 0;
        selectRandomInt = random.nextInt(size.size());
        size.get(selectRandomInt).click();
        logger.info("Rastgele beden secilir");
    }

    @Step("<id> Email gir")
    public void emailGirisi(String mail){
        MobileElement email = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etEposta"));
        email.sendKeys("batuhanaci@hotmail.com");
        logger.info(mail + "Mail adresi girilir.");
    }

    @Step("<id> Sifre gir")
    public void sifreGirisi(String pswrd){
        MobileElement password = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etPassword"));
        password.sendKeys("abcd1234");
        logger.info(pswrd + "Sifre girilir.");
    }

    @Step("Sayfayı yukarı kaydır")
    public void swipeUpI() {
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefon Boyutu " + dims);
        PointOption pointOptionStart, pointOptionEnd;
        int edgeBorder = 10;
        final int PRESS_TIME = 200; // ms
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("pointOptionStart " + pointOptionStart);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        System.out.println("pointOptionEnd " + pointOptionEnd);
        new TouchAction(appiumDriver)
                .press(pointOptionStart)
                // a bit more reliable when we add small wait
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                .moveTo(pointOptionEnd)
                .release().perform();
    }




}
