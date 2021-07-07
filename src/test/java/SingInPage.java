import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SingInPage {
    private SelenideElement loginInput = $(By.xpath("//*[@id=\"user_email\"]"));
    private SelenideElement passwordInput = $(By.xpath("//*[@id=\"user_password\"]"));
    public void loginInput (String text) {
        this.loginInput.val(text);
    }
    public void passwordInput(String text){
        this.passwordInput.val(text);
    }
}
