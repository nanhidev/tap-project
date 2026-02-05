package com.tap-project.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-project.pages.OpenCreateNewJobOpeningForPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OpenCreateNewJobOpeningFor extends DriverFactory {
OpenCreateNewJobOpeningForPage jobOpeningPage = new OpenCreateNewJobOpeningForPage(driver);
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
jobOpeningPage.navigateToJobOpeningScreen();
}
@When("the user locates the Add Job Opening button")
public void the_user_locates_the_add_job_opening_button() {
jobOpeningPage.locateAddJobOpeningButton();
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the form contains fields for job title, description, requirements, and other relevant information")
public void the_form_contains_fields_for_job_title_description_requirements_and_other_relevant_information() {
jobOpeningPage.areAllFieldsPresent();
}
@Then("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
jobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@When("the user clicks on the Add Job Opening button to open the form")
public void the_user_clicks_on_the_add_job_opening_button_to_open_the_form() {
jobOpeningPage.clicksAddJobOpeningButton();
}
@Then("the form includes mandatory fields such as Job Title, Job Description, and Job Requirements")
public void the_form_includes_mandatory_fields() {
jobOpeningPage.areMandatoryFieldsPresent();
}
@Then("each mandatory field is clearly marked")
public void each_mandatory_field_is_clearly_marked() {
jobOpeningPage.areMandatoryFieldsClearlyMarked();
}
@When("the user fills in the Job Title with {string}")
public void the_user_fills_in_the_job_title_with(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("the user fills in the Job Description with {string}")
public void the_user_fills_in_the_job_description_with(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@When("the user fills in the Job Requirements with {string}")
public void the_user_fills_in_the_job_requirements_with(String jobRequirements) {
jobOpeningPage.fillInJobRequirements(jobRequirements);
}
@When("the user clicks on the Save button")
public void the_user_clicks_on_the_save_button() {
jobOpeningPage.clicksSaveButton();
}
@Then("the job opening is saved successfully")
public void the_job_opening_is_saved_successfully() {
jobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the user is redirected to the Job Opening screen")
public void the_user_is_redirected_to_the_job_opening_screen() {
jobOpeningPage.isUserRedirectedToJobOpeningScreen();
}
@Then("a success message is displayed confirming the job opening has been created")
public void a_success_message_is_displayed_confirming_the_job_opening_has_been_created() {
jobOpeningPage.isSuccessMessageDisplayed();
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
jobOpeningPage.clicksCancelButton();
}
@Then("the Create New Job Opening form should be closed")
public void the_create_new_job_opening_form_should_be_closed() {
jobOpeningPage.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user should be returned to the Job Opening screen without any data being saved")
public void the_user_should_be_returned_to_the_job_opening_screen_without_any_data_being_saved() {
jobOpeningPage.isUserOnJobOpeningScreen();
}
@When("the user fills in valid data with Job Title as {string}")
public void the_user_fills_in_valid_data_with_job_title_as(String jobTitle) {
jobOpeningPage.fillInJobTitle(jobTitle);
}
@When("the user fills in valid data with Job Description as {string}")
public void the_user_fills_in_valid_data_with_job_description_as(String jobDescription) {
jobOpeningPage.fillInJobDescription(jobDescription);
}
@When("the user fills in valid data with Job Requirements as {string}")
public void the_user_fills_in_valid_data_with_job_requirements_as(String jobRequirements) {
jobOpeningPage.fillInJobRequirements(jobRequirements);
}
@When("the user fills in valid data in all mandatory fields and some optional fields")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_and_some_optional_fields() {
jobOpeningPage.fillInJobTitle("Software Engineer");
jobOpeningPage.fillInJobDescription("Develop and maintain software applications.");
jobOpeningPage.fillInJobRequirements("Bachelor's degree in Computer Science or related field, 3+ years of experience in software development.");
}
@When("the user fills in valid data in all mandatory fields and all optional fields")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_and_all_optional_fields() {
jobOpeningPage.fillInJobTitle("Software Engineer");
jobOpeningPage.fillInJobDescription("Develop and maintain software applications.");
jobOpeningPage.fillInJobRequirements("Bachelor's degree in Computer Science, 3+ years of experience.");
// Fill in additional optional fields if any
}
@When("the user fills in valid data in all mandatory fields and leaves optional fields empty")
public void the_user_fills_in_valid_data_in_all_mandatory_fields_and_leaves_optional_fields_empty() {
jobOpeningPage.fillInJobTitle("Software Engineer");
jobOpeningPage.fillInJobDescription("Develop and maintain software applications.");
jobOpeningPage.fillInJobRequirements("Bachelor's degree in Computer Science.");
// Do not fill in optional fields
}
@When("the user fills in the Job Title and Job Description fields")
public void the_user_fills_in_the_job_title_and_job_description_fields() {
jobOpeningPage.fillInJobTitle("Software Engineer");
jobOpeningPage.fillInJobDescription("Develop and maintain software applications.");
}
@Then("all fields are reset to their default state")
public void all_fields_are_reset_to_their_default_state() {
jobOpeningPage.areAllFieldsResetToDefaultState();
}
@When("the user uses a screen reader to navigate through the form fields")
public void the_user_uses_a_screen_reader_to_navigate_through_the_form_fields() {
// Implementation logic for screen reader navigation
}
@Then("all form fields are announced correctly by the screen reader")
public void all_form_fields_are_announced_correctly_by_the_screen_reader() {
jobOpeningPage.areFormFieldsAnnouncedCorrectly();
}
@Then("labels for each field are clearElement and descriptive")
public void labels_for_each_field_are_clear_and_descriptive() {
jobOpeningPage.areFieldLabelsClearAndDescriptive();
}
@When("the user uses the Tab key to navigate through the form fields")
public void the_user_uses_the_tab_key_to_navigate_through_the_form_fields() {
// Implementation logic for Tab key navigation
}
@When("the user uses the Enter key to select the Save button")
public void the_user_uses_the_enter_key_to_select_the_save_button() {
// Implementation logic for Enter key selection
}
@Then("the user can navigate through all fields using the Tab key")
public void the_user_can_navigate_through_all_fields_using_the_tab_key() {
jobOpeningPage.canNavigateUsingTabKey();
}
@Then("the Save button is activated using the Enter key")
public void the_save_button_is_activated_using_the_enter_key() {
jobOpeningPage.isSaveButtonActivated();
}

@Given("the create new job opening form is displayed again")
public void the_create_new_job_opening_form_is_displayed_again() {
openCreateNewJobOpeningForPage.verifyJobOpeningFormDisplayed();
}
@Then("labels for each field are clearElement descriptive")
public void labels_for_each_field_are_clear_descriptive() {
openCreateNewJobOpeningForPage.areFieldLabelsDescriptive();
}
@When("the user enters {string} in the job title field")
public void the_user_enters_in_the_job_title_field(String jobTitle) {
openCreateNewJobOpeningForPage.enterJobTitle(jobTitle);
}
@When("the user enters {string} in the job description field")
public void the_user_enters_in_the_job_description_field(String jobDescription) {
openCreateNewJobOpeningForPage.enterJobDescription(jobDescription);
}
@And("the user clicks on the add job opening button again")
public void the_user_clicks_on_the_add_job_opening_button_again() {
openCreateNewJobOpeningForPage.clickAddJobOpeningButton();
}
}