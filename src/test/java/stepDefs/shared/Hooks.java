package stepDefs.shared;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.BeforeAll;
import utils.ConfigHelper;
import utils.Driver;

public class Hooks {
    @Before
    public static void StartBrowser()
    {
        Driver.rootURL = ConfigHelper.getProperty("baseURL");
        Driver.startDriver();
    }

    @After
    public static void Shutdown()
    {
        Driver.ShutDown();
    }
}
