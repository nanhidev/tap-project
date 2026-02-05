package com.tap-project.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-project.pages.UploadNewCandidateProfile_po;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile_po extends DriverFactory {
UploadNewCandidateProfile_po uploadNewCandidateProfilePage = new UploadNewCandidateProfile_po(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@Given("the upload icon is visible and clickable")
public void the_upload_icon_is_visible_and_clickable() {
uploadNewCandidateProfilePage.isUploadIconVisible();
}
@When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String validCandidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(validCandidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message appears indicating the profile was uploaded successfully")
public void a_success_confirmation_message_appears_indicating_the_profile_was_uploaded_successfully() {
uploadNewCandidateProfilePage.isUploadSuccessMessageDisplayed();
}
@Then("the recruiter should see a confirmation message for the {string}")
public void the_recruiter_should_see_a_confirmation_message_for_the_candidate_profile_file(String candidateProfileFile) {
uploadNewCandidateProfilePage.isConfirmationMessageDisplayed(candidateProfileFile);
}
@Then("both profiles should be listed in the Profile section")
public void both_profiles_should_be_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areProfilesListed();
}
@When("the user browses and selects a candidate profile file in a supported format {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_in_a_supported_format(String fileFormat) {
uploadNewCandidateProfilePage.selectCandidateProfileFileInFormat(fileFormat);
}
@Then("the upload process should complete without errors")
public void the_upload_process_should_complete_without_errors() {
uploadNewCandidateProfilePage.isUploadProcessCompleted();
}
@Then("the metadata should be displayed correctly in the Profile section")
public void the_metadata_should_be_displayed_correctly_in_the_profile_section() {
uploadNewCandidateProfilePage.isMetadataDisplayedCorrectly();
}
@When("the user browses and selects multiple valid candidate profile files {string}")
public void the_user_browses_and_selects_multiple_valid_candidate_profile_files(String candidateProfileFiles) {
uploadNewCandidateProfilePage.selectMultipleCandidateProfileFiles(candidateProfileFiles);
}
@Then("all uploaded profiles should be listed in the Profile section")
public void all_uploaded_profiles_should_be_listed_in_the_profile_section() {
uploadNewCandidateProfilePage.areAllProfilesListed();
}

@Given("the user browses selects a candidate profile file in a supported format")
public void the_user_browses_selects_a_candidate_profile_file_in_a_supported_format() {
uploadNewCandidateProfilePage.selectCandidateProfileFileInSupportedFormat();
}
@Given("the user browses selects a candidate profile file with metadata")
public void the_user_browses_selects_a_candidate_profile_file_with_metadata() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithMetadata();
}
@Given("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@When("the recruiter clicks on the upload (cloud) icon")
public void the_recruiter_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
@Then("the user should see a success confirmation message indicating the profile was uploaded successfully")
public void the_user_should_see_a_success_confirmation_message_indicating_the_profile_was_uploaded_successfully() {
Assert.assertTrue("Success confirmation message should be displayed",
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed());
}
@Given("the user browses selects a candidate profile file in {string}")
public void the_user_browses_selects_a_candidate_profile_file_in(String fileType) {
uploadNewCandidateProfilePage.selectCandidateProfileFileInFormat(fileType);
}
@Given("the user browses selects multiple valid candidate profile files")
public void the_user_browses_selects_multiple_valid_candidate_profile_files() {
uploadNewCandidateProfilePage.selectMultipleValidCandidateProfileFiles();
}
@Given("the user browses selects a candidate profile file with a different valid extension {string}")
public void the_user_browses_selects_a_candidate_profile_file_with_a_different_valid_extension(String fileExtension) {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithDifferentValidExtension(fileExtension);
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Given("the recruiter browses selects the {string}")
public void the_recruiter_browses_selects_the(String fileName) {
uploadNewCandidateProfilePage.selectFileByName(fileName);
}
@When("the user clicks the upload button")
public void the_user_clicks_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Given("the user browses selects a candidate profile file with the filename {string}")
public void the_user_browses_selects_a_candidate_profile_file_with_the_filename(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFileByName(fileName);
}
}