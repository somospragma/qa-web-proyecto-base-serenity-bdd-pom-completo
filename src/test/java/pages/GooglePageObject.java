package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("https:/www.google.com.co")
public class GooglePageObject extends PageObject {

    @FindBy(name = "q")
    WebElementFacade SEARCH_FIELD;

    public void writeOnSearchField(String string){
        enter(string).into(SEARCH_FIELD);
    }

    public void pressEnterOnSearchField(){
//        enter(Keys.ENTER).into(SEARCH_FIELD);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(SEARCH_FIELD,Keys.ENTER).perform();
        enter(Keys.ENTER).into(SEARCH_FIELD);
    }

    public void assertContent(){
        waitForRenderedElements(By.xpath("//*[contains(text(),\"Online Courses\")]"));
        assertThat(getDriver().getPageSource().contains("Online Courses"),equalTo(true));
    }
}
