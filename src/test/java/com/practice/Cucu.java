package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Cucu {

    WebDriver driver = new ChromeDriver();

    @Given("the user is on the Google search page")
    public void userIsOnGoogleSearchPage() {
        driver.get("https://www.google.com");
    }

    @When("the user enters {string} in the search bar")
    public void userEntersSearchTerm(String searchTerm) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
    }

    @When("clicks the search button")
    public void userClicksSearchButton() {
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
    }

    @Then("the search results page is displayed")
    public void searchResultsPageIsDisplayed() {
        // Add assertions to verify the search results page
        driver.quit();
    }
}