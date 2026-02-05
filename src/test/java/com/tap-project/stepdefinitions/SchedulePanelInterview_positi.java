package com.tap-project.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.tap-project.driverfactory.DriverFactory;
import com.tap-project.pages.SchedulePanelInterview_positiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview_positi extends DriverFactory {
SchedulePanelInterview_positiPage schedulePanelInterviewPage = new SchedulePanelInterview_positiPage(driver);
@Given("the recruiter is on the Schedule Interview Page")
public void the_recruiter_is_on_the_schedule_interview_page() {
schedulePanelInterviewPage.navigateToScheduleInterviewPage();
}
@When("the recruiter clicks on Create Interview")
public void the_recruiter_clicks_on_create_interview() {
schedulePanelInterviewPage.clicksCreateInterview();
}
@When("the recruiter selects a Job Opening from the dropdown")
public void the_recruiter_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpening();
}
@When("the recruiter selects a Location from the available options")
public void the_recruiter_selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocation();
}
@When("the recruiter enters the Candidate's email address {string} and selects the candidate")
public void the_recruiter_enters_the_candidates_email_address_and_selects_the_candidate(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmailAndSelect(candidateEmail);
}
@When("the recruiter chooses the Panel Interview option")
public void the_recruiter_chooses_the_panel_interview_option() {
schedulePanelInterviewPage.selectPanelInterviewOption();
}
@When("the recruiter selects the interview Date {string} and Start Time {string}")
public void the_recruiter_selects_the_interview_date_and_start_time(String interviewDate, String startTime) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(interviewDate, startTime);
}
@When("the recruiter selects Attendees {string} and Interview Round {string}")
public void the_recruiter_selects_attendees_and_interview_round(String attendees, String interviewRound) {
schedulePanelInterviewPage.selectAttendeesAndInterviewRound(attendees, interviewRound);
}
@When("the recruiter selects the Interview Provider {string}")
public void the_recruiter_selects_the_interview_provider(String interviewProvider) {
schedulePanelInterviewPage.selectInterviewProvider(interviewProvider);
}
@When("the recruiter clicks on Next")
public void the_recruiter_clicks_on_next() {
schedulePanelInterviewPage.clicksNext();
}
@When("the recruiter attaches the required files {string}")
public void the_recruiter_attaches_the_required_files(String requiredFiles) {
schedulePanelInterviewPage.attachRequiredFiles(requiredFiles);
}
@When("the recruiter clicks on Confirm and Send")
public void the_recruiter_clicks_on_confirm_and_send() {
schedulePanelInterviewPage.clicksConfirmAndSend();
}
@Then("the system should navigate to the interview summary page")
public void the_system_should_navigate_to_the_interview_summary_page() {
schedulePanelInterviewPage.isOnInterviewSummaryPage();
}
@Then("a confirmation message should appear indicating the interview is scheduled")
public void a_confirmation_message_should_appear_indicating_the_interview_is_scheduled() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@Then("notifications should be sent to all selected participants")
public void notifications_should_be_sent_to_all_selected_participants() {
schedulePanelInterviewPage.areNotificationsSent();
}
@Then("the scheduled interview should appear in the interview calendar")
public void the_scheduled_interview_should_appear_in_the_interview_calendar() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@Then("the interview details should be correctly displayed in the system")
public void the_interview_details_should_be_correctly_displayed_in_the_system() {
schedulePanelInterviewPage.areInterviewDetailsCorrect();
}
@Then("the candidate should receive an email notification with interview details")
public void the_candidate_should_receive_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isCandidateEmailNotificationReceived();
}
@When("the recruiter selects the scheduled panel interview to edit")
public void the_recruiter_selects_the_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledInterviewToEdit();
}
@When("the recruiter clicks on Edit")
public void the_recruiter_clicks_on_edit() {
schedulePanelInterviewPage.clicksEdit();
}
@When("the recruiter changes the Date and Time of the interview")
public void the_recruiter_changes_the_date_and_time_of_the_interview() {
schedulePanelInterviewPage.changeInterviewDateAndTime();
}
@When("the recruiter adds or removes Attendees")
public void the_recruiter_adds_or_removes_attendees() {
schedulePanelInterviewPage.addOrRemoveAttendees();
}
@When("the recruiter clicks on Save Changes")
public void the_recruiter_clicks_on_save_changes() {
schedulePanelInterviewPage.clicksSaveChanges();
}
@Then("the system saves the changes successfully")
public void the_system_saves_the_changes_successfully() {
schedulePanelInterviewPage.isChangesSavedSuccessfully();
}
@Then("a confirmation message appears indicating the interview has been updated")
public void a_confirmation_message_appears_indicating_the_interview_has_been_updated() {
schedulePanelInterviewPage.isUpdateConfirmationMessageDisplayed();
}
@Then("notifications are sent to all updated participants")
public void notifications_are_sent_to_all_updated_participants() {
schedulePanelInterviewPage.areUpdatedNotificationsSent();
}
@Then("the updated interview details are displayed in the interview calendar")
public void the_updated_interview_details_are_displayed_in_the_interview_calendar() {
schedulePanelInterviewPage.isUpdatedInterviewInCalendar();
}
@When("I schedule a panel interview with multiple attendees")
public void i_schedule_a_panel_interview_with_multiple_attendees() {
schedulePanelInterviewPage.schedulePanelInterviewWithMultipleAttendees();
}
@When("I complete the scheduling process")
public void i_complete_the_scheduling_process() {
schedulePanelInterviewPage.completeSchedulingProcess();
}
@Then("each attendee should receive an email notification with the interview details")
public void each_attendee_should_receive_an_email_notification_with_the_interview_details() {
schedulePanelInterviewPage.areAttendeeEmailNotificationsReceived();
}
@Then("the email should contain the correct Date, Time, and Location of the interview")
public void the_email_should_contain_the_correct_date_time_and_location_of_the_interview() {
schedulePanelInterviewPage.isEmailContentCorrect();
}
@Then("the email should include a calendar invite for the interview")
public void the_email_should_include_a_calendar_invite_for_the_interview() {
schedulePanelInterviewPage.isCalendarInviteIncluded();
}
@When("the recruiter selects the scheduled panel interview to cancel")
public void the_recruiter_selects_the_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the recruiter clicks on Cancel")
public void the_recruiter_clicks_on_cancel() {
schedulePanelInterviewPage.clicksCancel();
}
@When("the recruiter confirms the cancellation")
public void the_recruiter_confirms_the_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system cancels the interview successfully")
public void the_system_cancels_the_interview_successfully() {
schedulePanelInterviewPage.isInterviewCancelledSuccessfully();
}
@Then("a confirmation message appears indicating the interview has been canceled")
public void a_confirmation_message_appears_indicating_the_interview_has_been_canceled() {
schedulePanelInterviewPage.isCancellationConfirmationMessageDisplayed();
}
@Then("notifications are sent to all participants informing them of the cancellation")
public void notifications_are_sent_to_all_participants_informing_them_of_the_cancellation() {
schedulePanelInterviewPage.areCancellationNotificationsSent();
}
@Then("the canceled interview no longer appears in the interview calendar")
public void the_canceled_interview_no_longer_appears_in_the_interview_calendar() {
schedulePanelInterviewPage.isCanceledInterviewInCalendar();
}
@When("the user views the list of scheduled panel interviews")
public void the_user_views_the_list_of_scheduled_panel_interviews() {
schedulePanelInterviewPage.viewScheduledPanelInterviews();
}
@Then("all scheduled panel interviews are displayed in the calendar")
public void all_scheduled_panel_interviews_are_displayed_in_the_calendar() {
schedulePanelInterviewPage.areScheduledInterviewsDisplayed();
}
@Then("each interview shows the correct Date, Time, and Attendees")
public void each_interview_shows_the_correct_date_time_and_attendees() {
schedulePanelInterviewPage.areInterviewDetailsCorrect();
}
@Then("the user can click on an interview to view detailed information")
public void the_user_can_click_on_an_interview_to_view_detailed_information() {
schedulePanelInterviewPage.isInterviewDetailViewable();
}

@Then("the scheduled interview appears in the interview calendar")
public void the_scheduled_interview_appears_in_the_interview_calendar() {
schedulePanelInterviewPage.isInterviewScheduledInCalendar();
}
@Then("the system navigates to the interview summary page")
public void the_system_navigates_to_the_interview_summary_page() {
schedulePanelInterviewPage.isOnInterviewSummaryPage();
}
@Then("the candidate receives an email notification with interview details")
public void the_candidate_receives_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isEmailNotificationReceived();
}
@When("the recruiter selects the interview provider")
public void the_recruiter_selects_the_interview_provider() {
schedulePanelInterviewPage.selectInterviewProvider();
}
@When("the recruiter attaches required files")
public void the_recruiter_attaches_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@Then("all optional information is correctly displayed in the interview details")
public void all_optional_information_is_correctly_displayed_in_the_interview_details() {
schedulePanelInterviewPage.isOptionalInformationDisplayedCorrectly();
}
@When("the recruiter fills in optional fields with {string} {string}")
public void the_recruiter_fills_in_optional_fields_with(String field1, String field2) {
schedulePanelInterviewPage.fillInOptionalFields(field1, field2);
}
@Then("notifications are sent to all selected participants")
public void notifications_are_sent_to_all_selected_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}
@When("the recruiter selects attendees interview round")
public void the_recruiter_selects_attendees_interview_round() {
schedulePanelInterviewPage.selectAttendeesInterviewRound();
}
@When("the recruiter selects the interview date start time")
public void the_recruiter_selects_the_interview_date_start_time() {
schedulePanelInterviewPage.selectInterviewDateStartTime();
}
@Then("a confirmation message appears indicating the interview is scheduled")
public void a_confirmation_message_appears_indicating_the_interview_is_scheduled() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
}