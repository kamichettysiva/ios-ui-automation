package regional.common.pageobjects;


import com.google.gson.JsonElement;
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

    public void clickBtn(String Class,int btnIndex){
        JsonObject startId = wda.findElementsByClass("XCUIElementType" + Class, btnIndex);
        JsonElement element = startId.get("value").getAsJsonArray().get(btnIndex).getAsJsonObject().get("ELEMENT");
        wda.tap(element.getAsString());
    }
    public void  ClickOnElement(String Class, String Label, String FieldToRefer){
        JsonElement startId = FindElement(Class, Label, FieldToRefer);
        wda.tap(startId.getAsString());
    }
    public void clickSearchText() {
        JsonObject searchFieldFocus = wda.findElementsByXpath("//XCUIElementTypeImage[@name='search-icon']");
        wda.tap(searchFieldFocus.get("ELEMENT").getAsString());
    }

    public void setValue(String Class, String Label, String val) {
        JsonObject searchField = wda.findElementsByClass("XCUIElementType" + Class, Label);
        wda.input(searchField.get("ELEMENT").getAsString(), val);
    }
    public void setValueNew(String Class, String Label, String FieldToRefer, String val) {
        JsonElement  element = FindElement(Class,Label,FieldToRefer);
        wda.input(element.getAsString(), val);
    }
    public void selectLocation(String loc) {
        JsonObject locItem = wda.findElementsByClass("XCUIElementTypeStaticText", loc);
        wda.tap(locItem.get("ELEMENT").getAsString());
    }

    public JsonElement FindElement(String Class, String text, String FieldToRefer) {
        String XpathString = "//XCUIElementType" + Class + "[@" + FieldToRefer + "=\\\"" + text + "\\\"]";
         JsonObject object = wda.findElementsByXpath( XpathString );
        JsonElement element = object.getAsJsonObject().get("ELEMENT");
         if(element.isJsonNull()){
             XpathString = "//XCUIElementType" + Class + "[@label=\\\"" + text + "\\\"]";
             object = wda.findElementsByXpath( XpathString );
             element = object.getAsJsonObject().get("ELEMENT");
         }
         return element;
    }
    public void EnterEmailId(String email) {
        JsonObject emailFieldFocus = wda.findElementsByXpath("//XCUIElementTypeTextField[@name='Email address']");
        wda.tap(emailFieldFocus.get("ELEMENT").getAsString());
        wda.input(emailFieldFocus.get("ELEMENT").getAsString(), email);
    }

    public void EnterPassword(String password) {
        JsonObject passwordFieldFocus = wda.findElementsByXpath("//XCUIElementTypeSecureTextField[@name='Password']");
        wda.tap(passwordFieldFocus.get("ELEMENT").getAsString());
        wda.input(passwordFieldFocus.get("ELEMENT").getAsString(), password);
    }

}
