package regional.common.stepdefs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import regional.common.pageobjects.BasePage;
import regional.common.runtime.SharedDriver;
import regional.common.runtime.WebDriverAgent;

public class CommonStepDefs {
    private WebDriverAgent wda;
    private BasePage basePage;

    public CommonStepDefs() {
        wda = new SharedDriver();
        basePage = new BasePage(wda);
    }

    @Given("^Start the \"(.*?)\" for device \"(.*?)\"$")
    public void startAppForDevice(String region, String device) {
        //wda.installApp(device, region);
        wda.openApp(device, region);
    }

    @When("^Click \"(.*?)\"$")
    public void clickBtn(String btnLabel) {
        if (btnLabel.equals("Filter")){
            btnLabel="Save search - search not saved";
        }
        basePage.clickBtn(btnLabel);
    }

    @When("^Type the search criteria \"(.*?)\" in search box$")
    public void typeSearchInfo(String val) {
        basePage.clickSearchText();
        basePage.setValue("SearchField", "Done", val);
    }

    @When("^Select location \"(.*?)\" from auto suggestion$")
    public void selectFromSuggestion(String loc) {
        basePage.selectLocation(loc);
    }

    @When("^Check Search Field Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkSearchUserguide(String title, String text) {
        JsonElement Title = basePage.FindElement("TextView",title,"value");
        JsonElement Text =basePage.FindElement("TextView",text,"value");
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            JsonObject searchFieldFocus = wda.findElementsByXpath("//XCUIElementTypeImage[@name='search-icon']");
            wda.tap(searchFieldFocus.get("ELEMENT").getAsString());
        }
    }

    @When("^Check Filter Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkFilterUserguide(String title, String text) {
        JsonElement Title = basePage.FindElement("TextView",title,"value");
        JsonElement Text =basePage.FindElement("TextView",text,"value");
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            JsonObject FilterIcon = wda.findElementsByXpath("//XCUIElementTypeButton[@name='Save search - search not saved']");
            wda.tap(FilterIcon.get("ELEMENT").getAsString());
        }
    }


    @When("^Check Bookmark Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkBookmarkUserguide(String title, String text) throws InterruptedException {
        JsonElement Title = basePage.FindElement("TextView",title,"value");
        JsonElement Text =basePage.FindElement("TextView",text,"value");
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            Thread.sleep(1000);
            basePage.clickBtn("Cell",1);
            Thread.sleep(1000);
            System.out.println("Clicked this");
        }
    }

    @When("^Enter \"(.*?)\" and \"(.*?)\"$")
    public void enterCredentials(String Email, String Password) {
        basePage.EnterEmailId(Email);
        basePage.EnterPassword(Password);
    }

    @When("^Click on Login button$")
    public void ClickBtnIdx() {
            basePage.clickBtn("Button",2);
        }

    @When("^Click on \"(.*?)\"$")
    public void ClickOnElement(String Label) {
        basePage.ClickOnElement("Other", Label, "label");
    }

    @When("^Tap on \"(.*?)\" search \"(.*?)\" and select \"(.*?)\"$")
        public void SetPropertyType(String TyepFilter, String Keyword, String PropType){
        basePage.ClickOnElement("StaticText", TyepFilter, "value");
        basePage.ClickOnElement("SearchField","Search type", "label");
        basePage.setValueNew("SearchField", "Search type","label", Keyword);
        basePage.ClickOnElement("StaticText", PropType, "value");

    }

    @Then("^Check welcome page has Username \"(.*?)\" and Email \"(.*?)\"$")
    public void CheckWelcomePage(String username, String email) {
        JsonElement UserName = basePage.FindElement("StaticText", "Welcome, " + username,"value");
        JsonElement Email = basePage.FindElement("StaticText", email,"value");
        if (UserName.isJsonNull() || Email.isJsonNull()){
            System.out.println("Login is failed");
        }
    }

    @Then("^Verify and confirm \"(.*?)\" popup$")
    public void LogoutPopup(String Label) {
        JsonElement Title = basePage.FindElement("StaticText", "Confirm logout","value");
        JsonElement Text = basePage.FindElement("StaticText", "You'll no longer be able to save properties or searches","value");
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            basePage.clickBtn(Label);
            System.out.println("Logged out successfully");
        }
    }

    @Then("^Select first listing from the SRP$")
    public void ClickOnFirstListing() throws InterruptedException {
        Thread.sleep(4000);
        basePage.clickBtn("Cell",1);
    }
    @Then("^Verify \"(.*?)\" on snackbar$")
    public void VerifySnackbar(String FilterText) throws InterruptedException {
        basePage.FindElement("StaticText", FilterText,"label");
    }
}

