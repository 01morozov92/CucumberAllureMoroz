import io.cucumber.java.en.Then;

public class AccountPageDefs {
    AccountPage accountPage = new AccountPage();
    @Then("click {string} close button")
    public void clickCloseButton(String text) {
        accountPage.clickCloseButton(text);
    }


    @Then("content have text All projects")
    public void contentHaveTextAllProjects() {
        accountPage.contentIsVisible();
    }
}
