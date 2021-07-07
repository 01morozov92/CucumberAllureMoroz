import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountPage {
    @Test
    public void clickCloseButton (String text) {
        $(By.xpath("//*[@id=\"" + text + "\"]/div/div[1]/button/i")).click();
    }
    public void contentIsVisible () {
        $(By.xpath("//*[text()='All projects']")).shouldBe(Condition.visible);    }
}
