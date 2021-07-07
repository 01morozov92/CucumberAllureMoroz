import io.cucumber.java.en.Then;

public class SignInPageDefs {
    SingInPage signinPage = new SingInPage();
    @Then("input login")
    public void inputLogin() {
        signinPage.loginInput(UserConfig.USER_LOGIN);
    }
    @Then("input password")
    public void inputPassword() {
        signinPage.passwordInput(UserConfig.USER_PASSWORD);
    }
}
