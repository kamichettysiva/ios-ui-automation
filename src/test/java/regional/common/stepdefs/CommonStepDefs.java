package regional.common.stepdefs;

import cucumber.api.java.en.Given;
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
        wda.openApp(device, region);
    }

    @When("^Click \"(.*?)\"$")
    public void clickBtn(String btnLabel) {
        basePage.clickBtn(btnLabel);
    }

    @When("^Type the search criteria \"(.*?)\" in search box$")
    public void typeSearchInfo(String val) {
        basePage.clickSearchText();
        basePage.setValue(val);
    }

    @When("^Select location \"(.*?)\" from auto suggestion$")
    public void selectFromSuggestion(String loc) {
        basePage.selectLocation(loc);
    }
}
