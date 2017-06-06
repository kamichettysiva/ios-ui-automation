package regional.common.pageobjects;


import com.google.gson.JsonObject;
import regional.common.runtime.WebDriverAgent;

public class BasePage {

    protected WebDriverAgent wda;

    public BasePage(WebDriverAgent wda) {
        this.wda = wda;
    }

    public void clickBtn(String btnLabel) {
        JsonObject startId = wda.findElementsByClass("XCUIElementTypeButton", btnLabel);
        wda.tap(startId.get("ELEMENT").getAsString());
    }

    public void clickSearchText() {
        JsonObject tipMsg = wda.findElementsByXpath("//XCUIElementTypeTextView[@value='Start your search']");
        JsonObject searchFieldFocus = wda.findElementsByXpath("//XCUIElementTypeImage[@name='search-icon']");
        wda.tap(searchFieldFocus.get("ELEMENT").getAsString());
        System.out.println("Check");
        wda.tap(searchFieldFocus.get("ELEMENT").getAsString());
    }

    public void setValue(String val) {
        JsonObject searchField = wda.findElementsByClass("XCUIElementTypeSearchField", "SearchField");
        wda.input(searchField.get("ELEMENT").getAsString(), val);
    }

    public void selectLocation(String loc) {
        JsonObject locItem = wda.findElementsByClass("XCUIElementTypeStaticText", loc);
        wda.tap(locItem.get("ELEMENT").getAsString());
    }
}
