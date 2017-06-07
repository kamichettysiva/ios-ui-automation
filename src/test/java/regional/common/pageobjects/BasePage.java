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
        wda.sleepTimeout("5");
        wda.tap(startId.get("ELEMENT").getAsString());
    }

    public void clickSearchText() {
        JsonObject searchFieldFocus = wda.findElementsByXpath("//XCUIElementTypeImage[@name='search-icon']");
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

    public JsonObject VerifyText(String text) {
         JsonObject element = wda.findElementsByXpath( "//XCUIElementTypeTextView[@value='" + text + "']");
         return element;
    }
}
