package regional.common.stepdefs;

import com.google.gson.JsonObject;
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
        //wda.installApp(device, region);
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

    @When("^Check Search Field Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkSearchUserguide(String title, String text) {
        JsonObject Title = basePage.VerifyText(title);
        JsonObject Text =basePage.VerifyText(text);
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            JsonObject searchFieldFocus = wda.findElementsByXpath("//XCUIElementTypeImage[@name='search-icon']");
            wda.tap(searchFieldFocus.get("ELEMENT").getAsString());
        }
    }

    @When("^Check Filter Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkFilterUserguide(String title, String text) {
        JsonObject Title = basePage.VerifyText(title);
        JsonObject Text =basePage.VerifyText(text);
        if (!Title.isJsonNull() && !Text.isJsonNull()){
            JsonObject FilterIcon = wda.findElementsByXpath("//XCUIElementTypeButton[@name='Save search - search not saved']");
            wda.tap(FilterIcon.get("ELEMENT").getAsString());
        }
    }


    @When("^Check Bookmark Userguide with title \"(.*?)\" and text \"(.*?)\"$")
    public void checkBookmarkUserguide(String title, String text) {
        JsonObject UGShortlistTitle = wda.findElementsByXpath("//XCUIElementTypeTextView[@value='Shortlist properties']");
        JsonObject UGShortlistText = wda.findElementsByXpath("//XCUIElementTypeTextView[@value='Tap to shortlist property to view it later']");
        if(!UGShortlistTitle.isJsonNull() && !UGShortlistText.isJsonNull()) {
            JsonObject FilterIcon = wda.findElementsByXpath("//XCUIElementTypeButton[@name='Save search - search not saved']");
            wda.tap(FilterIcon.get("ELEMENT").getAsString());
        }
    }


    }

