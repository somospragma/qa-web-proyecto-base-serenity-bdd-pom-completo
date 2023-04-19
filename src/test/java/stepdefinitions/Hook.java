package stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
    }
}
