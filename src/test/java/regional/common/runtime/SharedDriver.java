package regional.common.runtime;

import cucumber.api.java.Before;

public class SharedDriver extends WebDriverAgent {
    private static WebDriverAgent wda = null;

    static {
        wda = new WebDriverAgent();
    }

    public SharedDriver() {
        wda = new WebDriverAgent();
    }

    @Before("@complete-7p")
    public void beforeDevice7pScenario() {
        wda.cleanEnv("7p", "my");
    }

    @Before("@complete-7")
    public void beforeDevice7Scenario() {
      //  wda.cleanEnv("7", "my");
        if (wda.sessionId==null){
            wda.cleanEnv("7", "my");
            System.out.println("Cleaned");
        }
    }

}
