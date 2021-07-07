import io.cucumber.java.en.Then;

public class BasicPageDefs {
    BasicPage basicPage = new BasicPage();
    @Then("click {string} button")
    public void clickButton(String text) {
        basicPage.clickButton(text);
    }

    @Then("click {string} button login")
    public void clickNew_userButton(String text1) {
        basicPage.clickButtonLogin(text1);
    }
}
