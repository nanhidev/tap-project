package com.tap-project.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-project.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the user is on the Dashboard")
public void theUserIsOnTheDashboard() {
driver = DriverFactory.getDriver();
}
@When("the user clicks on the {string} option in the side navigation")
public void theUserClicksOnTheOptionInTheSideNavigation(String jobOpeningOption) {
createJobOpeningPage.clicksOnJobOpeningOption(jobOpeningOption);
}
@Then("the Job Opening screen should be displayed")
public void theJobOpeningScreenShouldBeDisplayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void theButtonShouldBeVisible(String buttonName) {
createJobOpeningPage.isButtonVisible(buttonName);
}
@When("the recruiter clicks on the {string} button")
public void theRecruiterClicksOnTheButton(String action) {
createJobOpeningPage.clicksOnAddJobOpeningButton(action);
}
@Then("the Create New Job Opening form should be opened")
public void theCreateNewJobOpeningFormShouldBeOpened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the {string} and {string} buttons should be displayed")
public void theAndButtonsShouldBeDisplayed(String button1, String button2) {
createJobOpeningPage.areButtonsDisplayed(button1, button2);
}
@When("the recruiter selects the Job Role {string}")
public void theRecruiterSelectsTheJobRole(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter selects the Location {string}")
public void theRecruiterSelectsTheLocation(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the recruiter enters Minimum Experience {string}")
public void theRecruiterEntersMinimumExperience(String minimumExperience) {
createJobOpeningPage.enterMinimumExperience(minimumExperience);
}
@When("the recruiter enters Maximum Experience {string}")
public void theRecruiterEntersMaximumExperience(String maximumExperience) {
createJobOpeningPage.enterMaximumExperience(maximumExperience);
}
@When("the recruiter enters Qualification {string}")
public void theRecruiterEntersQualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the recruiter enters Short Job Description {string}")
public void theRecruiterEntersShortJobDescription(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@When("the recruiter enters Responsibilities {string}")
public void theRecruiterEntersResponsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the recruiter clicks on {string}")
public void theRecruiterClicksOn(String action) {
createJobOpeningPage.clicksOnSave(action);
}
@Then("the job opening should be saved successfully")
public void theJobOpeningShouldBeSavedSuccessfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the job opening should be available in the Job Opening list")
public void theJobOpeningShouldBeAvailableInTheJobOpeningList() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@When("the recruiter leaves Maximum Experience blank")
public void theRecruiterLeavesMaximumExperienceBlank() {
createJobOpeningPage.leaveMaximumExperienceBlank();
}
@When("the recruiter leaves Responsibilities blank")
public void theRecruiterLeavesResponsibilitiesBlank() {
createJobOpeningPage.leaveResponsibilitiesBlank();
}
@When("the admin selects the Job Role {string}")
public void theAdminSelectsTheJobRole(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the admin selects the Location {string}")
public void theAdminSelectsTheLocation(String location) {
createJobOpeningPage.selectLocation(location);
}
@When("the admin enters the Minimum Experience {string}")
public void theAdminEntersTheMinimumExperience(String minimumExperience) {
createJobOpeningPage.enterMinimumExperience(minimumExperience);
}
@When("the admin enters the Maximum Experience {string}")
public void theAdminEntersTheMaximumExperience(String maximumExperience) {
createJobOpeningPage.enterMaximumExperience(maximumExperience);
}
@When("the admin enters the Qualification {string}")
public void theAdminEntersTheQualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the admin selects the Vendor {string}")
public void theAdminSelectsTheVendor(String vendor) {
createJobOpeningPage.selectVendor(vendor);
}
@When("the recruiter enters valid Primary Skills {string}")
public void theRecruiterEntersValidPrimarySkills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@When("the recruiter enters valid Secondary Skills {string}")
public void theRecruiterEntersValidSecondarySkills(String secondarySkills) {
createJobOpeningPage.enterSecondarySkills(secondarySkills);
}
@Then("the job opening should be available in the Job Opening list with the correct tags")
public void theJobOpeningShouldBeAvailableInTheJobOpeningListWithTheCorrectTags() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectTags();
}
@Then("the job opening should be available in the Job Opening list with the correct vendor")
public void theJobOpeningShouldBeAvailableInTheJobOpeningListWithTheCorrectVendor() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectVendor();
}
@Then("the job opening should be available in the Job Opening list with the correct work mode")
public void theJobOpeningShouldBeAvailableInTheJobOpeningListWithTheCorrectWorkMode() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectWorkMode();
}
@Then("the job opening should be available in the Job Opening list with the correct department")
public void theJobOpeningShouldBeAvailableInTheJobOpeningListWithTheCorrectDepartment() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectDepartment();
}
@Then("the job opening should be available in the Job Opening list with the correct industry type")
public void theJobOpeningShouldBeAvailableInTheJobOpeningListWithTheCorrectIndustryType() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectIndustryType();
}

@Given("the recruiter clicks on the add job opening button")
public void the_recruiter_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clickAddJobOpeningButton();
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@When("I enter qualification")
public void i_enter_qualification() {
createJobOpeningPage.enterQualification("Bachelor's Degree");
}
@When("the recruiter selects a job role")
public void the_recruiter_selects_a_job_role() {
createJobOpeningPage.selectJobRole("Software Engineer");
}
@When("the recruiter enters the maximum experience")
public void the_recruiter_enters_the_maximum_experience() {
createJobOpeningPage.enterMaximumExperience("5");
}
@When("I enter minimum experience")
public void i_enter_minimum_experience() {
createJobOpeningPage.enterMinimumExperience("2");
}
@When("I select a location")
public void i_select_a_location() {
createJobOpeningPage.selectLocation("New York");
}
@When("the recruiter selects a location")
public void the_recruiter_selects_a_location() {
createJobOpeningPage.selectLocation("New York");
}
@Then("the save cancel buttons should be displayed")
public void the_save_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveCancelButtonsDisplayed();
}
@When("the recruiter clicks on save")
public void the_recruiter_clicks_on_save() {
createJobOpeningPage.clickSaveButton();
}
@When("the recruiter enters valid secondary skills")
public void the_recruiter_enters_valid_secondary_skills() {
createJobOpeningPage.enterSecondarySkills("Java, SQL");
}
@When("the recruiter selects {string} as the job role")
public void the_recruiter_selects_as_the_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@When("the recruiter enters {string} as the qualification")
public void the_recruiter_enters_as_the_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the user clicks on the job opening option in the side navigation")
public void the_user_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@When("I clickElement on save")
public void i_click_on_save() {
createJobOpeningPage.clickSaveButton();
}
@Then("the job opening should be available in the job opening list with the correct skills")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_skills() {
createJobOpeningPage.isJobOpeningAvailable("Software Engineer", "Java, SQL");
}
@When("the recruiter enters a valid department")
public void the_recruiter_enters_a_valid_department() {
createJobOpeningPage.enterDepartment("Engineering");
}
@When("the recruiter enters tags")
public void the_recruiter_enters_tags() {
createJobOpeningPage.enterTags("Java, Full Stack");
}
@When("the recruiter enters a valid industry type")
public void the_recruiter_enters_a_valid_industry_type() {
createJobOpeningPage.enterIndustryType("Information Technology");
}
@When("the recruiter enters valid primary skills")
public void the_recruiter_enters_valid_primary_skills() {
createJobOpeningPage.enterPrimarySkills("Java, Spring");
}
@When("I select a job role")
public void i_select_a_job_role() {
createJobOpeningPage.selectJobRole("Software Engineer");
}
}