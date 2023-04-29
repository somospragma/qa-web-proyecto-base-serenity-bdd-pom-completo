package stepdefinitions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
    }
}
