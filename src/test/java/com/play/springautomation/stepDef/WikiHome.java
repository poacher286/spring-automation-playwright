package com.play.springautomation.stepDef;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.play.springautomation.SpringIntegrationTest;
import com.play.springautomation.page.PGWiki;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class WikiHome extends SpringIntegrationTest {

    @Autowired
    private PGWiki pgWiki;

    @Value("${wiki.url}")
    private String wikiUrl;

    @Given("I navigate to wikipedia")
    public void iNavigateToWiki(){
        try(Playwright playwright = Playwright.create()){
            BrowserType chromium = playwright.chromium();
            Browser chrome = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = chrome.newPage();
            page.navigate(wikiUrl);
            System.out.println(page.title());
        }
    }

    @Then("I verify slogan is present")
    public void iVerifySloganIsPresent() {
        pgWiki.verifySloganIsPresent();
    }
}
