import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://cucumber.netlify.app/");
    }

    @After
    public void tearDown(){
        closeWebDriver();
    }
}
