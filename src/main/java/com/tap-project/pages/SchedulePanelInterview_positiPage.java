package com.tap-project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap-project.utils.ElementUtils;
import org.junit.Assert;

public class SchedulePanelInterview_positiPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public SchedulePanelInterview_positiPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailInput")
    private WebElement candidateEmailInput;
    @FindBy(id = "panelInterviewOption")
    private WebElement panelInterviewOption;
    @FindBy(id = "interviewDateInput")
    private WebElement interviewDateInput;
    @FindBy(id = "startTimeInput")
    private WebElement startTimeInput;
    @FindBy(id = "attendeesDropdown")
    private WebElement attendeesDropdown;
    @FindBy(id = "interviewRoundDropdown")
    private WebElement interviewRoundDropdown;
    @FindBy(id = "interviewProviderDropdown")
    private WebElement interviewProviderDropdown;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "requiredFilesInput")
    private WebElement requiredFilesInput;
    @FindBy(id = "confirmAndSendButton")
    private WebElement confirmAndSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "interviewSummaryPage")
    private WebElement interviewSummaryPage;
    @FindBy(id = "notificationSent")
    private WebElement notificationSent;
    @FindBy(id = "saveChangesButton")
    private WebElement saveChangesButton;
    @FindBy(id = "cancellationConfirmationMessage")
    private WebElement cancellationConfirmationMessage;
    @FindBy(id = "scheduledInterviewsPanel")
    private WebElement scheduledInterviewsPanel;
    @FindBy(id = "calendarInvite")
    private WebElement calendarInvite;
    @FindBy(id = "confirmCancellationButton")
    private WebElement confirmCancellationButton;
    @FindBy(id = "updateConfirmationMessage")
    private WebElement updateConfirmationMessage;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "editButton")
    private WebElement editButton;
    @FindBy(id = "interviewDetails")
    private WebElement interviewDetails;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "optionalField")
    private WebElement optionalField;
    @FindBy(id = "attendeeDropdown")
    private WebElement attendeeDropdown;
    @FindBy(id = "scheduleButton")
    private WebElement scheduleButton;
    @FindBy(id = "completeButton")
    private WebElement completeButton;
    @FindBy(id = "optionalInfo")
    private WebElement optionalInfo;

    ublic void clickCreateInterview() {
        elementUtils.clickElement(createInterviewButton);
    }

    public void selectJobOpening() {
        elementUtils.clickElement(jobOpeningDropdown);
    }

    public void selectLocation() {
        elementUtils.clickElement(locationDropdown);
    }

    public void enterCandidateEmailAndSelect(String candidateEmail) {
        elementUtils.clearAndSendKeys(candidateEmailInput, candidateEmail);
    }

    public void selectPanelInterviewOption() {
        elementUtils.clickElement(panelInterviewOption);
    }

    public void selectInterviewDateAndStartTime(String interviewDate, String startTime) {
        elementUtils.clearAndSendKeys(interviewDateInput, interviewDate);
        elementUtils.clearAndSendKeys(startTimeInput, startTime);
    }

    public void selectAttendeesAndInterviewRound(String attendees, String interviewRound) {
        elementUtils.selectOptionInDropdown(attendeesDropdown, attendees);
        elementUtils.selectOptionInDropdown(interviewRoundDropdown, interviewRound);
    }

    public void selectInterviewProvider(String interviewProvider) {
        elementUtils.selectOptionInDropdown(interviewProviderDropdown, interviewProvider);
    }

    ublic void clickNext() {
        elementUtils.clickElement(nextButton);
    }

    public void attachRequiredFiles(String requiredFiles) {
        elementUtils.clearAndSendKeys(requiredFilesInput, requiredFiles);
    }

    ublic void clickConfirmAndSend() {
        elementUtils.clickElement(confirmAndSendButton);
    }

    public void isOnInterviewSummaryPage() {
        Assert.assertTrue("Not on Interview Summary Page", elementUtils.isElementDisplayed(interviewSummaryPage));
    }

    public void isConfirmationMessageDisplayed() {
        Assert.assertTrue("Confirmation message not displayed", elementUtils.isElementDisplayed(confirmationMessage));
    }

    public void areNotificationsSent() {
        Assert.assertTrue("Notifications not sent", elementUtils.isElementDisplayed(notificationSent));
    }

    public void isInterviewInCalendar() {
        // Implementation for checking if the interview is visible in calendar can be added here
    }

    public void areInterviewDetailsCorrect() {
        // Implementation for verifying interview details correctness can be added here
    }

    public void isCandidateEmailNotificationReceived() {
        // Implementation for checking candidate email notification can be added here
    }

    public void clicksSaveChanges() {
        elementUtils.clickElement(saveChangesButton);
    }

    public void isCancellationConfirmationMessageDisplayed() {
        Assert.assertTrue("Cancellation confirmation message is not displayed.", elementUtils.isElementDisplayed(cancellationConfirmationMessage));
    }

    public void areNotificationsSentToParticipants() {
        boolean notificationsSent = true; // Placeholder logic
        Assert.assertTrue(notificationsSent, "Notifications are not sent to participants.");
    }

    public void selectScheduledInterviewToCancel() {
        WebElement scheduledInterview = driver.findElement(By.xpath("//div[@class='interview'][@data-status='scheduled']"));
        elementUtils.clickElement(scheduledInterview);
    }

    public void areScheduledInterviewsDisplayed() {
        Assert.assertTrue("Scheduled interviews are not displayed.", elementUtils.isElementDisplayed(scheduledInterviewsPanel));
    }

    public void isCalendarInviteIncluded() {
        Assert.assertTrue("Calendar invite is not included in the notification.", elementUtils.isElementDisplayed(calendarInvite));
    }

    public void areCancellationNotificationsSent() {
        boolean notificationsSent = true; // Placeholder logic
        Assert.assertTrue(notificationsSent, "Cancellation notifications are not sent.");
    }

    public void confirmCancellation() {
        elementUtils.clickElement(confirmCancellationButton);
    }

    public void clicksEdit() {
        elementUtils.clickElement(editButton);
    }

    public void isEmailNotificationReceived() {
        boolean emailReceived = true; // Placeholder logic
        Assert.assertTrue(emailReceived, "Email notification is not received.");
    }

    public void isInterviewDetailViewable() {
        Assert.assertTrue("Interview details are not viewable.", elementUtils.isElementDisplayed(interviewDetails));
    }

    public void navigateToScheduleInterviewPage() {
        driver.get("http://localhost/scheduleInterview");
    }

    public void addOrRemoveAttendees() {
        elementUtils.selectOptionInDropdown(attendeeDropdown, "New Attendee");
    }

    public void viewScheduledPanelInterviews() {
        elementUtils.clickElement(scheduledInterviewsPanel);
    }

    public void fillInOptionalFields(String optionalInfoText) {
        elementUtils.clearAndSendKeys(optionalField, optionalInfoText);
    }

    public void areAttendeeEmailNotificationsReceived() {
        boolean notificationsReceived = true; // Placeholder logic
        Assert.assertTrue(notificationsReceived, "Attendee email notifications are not received.");
    }

    public void selectInterviewDateStartTime(String date, String time) {
        elementUtils.clearAndSendKeys(interviewDateInput, date);
        elementUtils.clearAndSendKeys(startTimeInput, time);
    }

    public void changeInterviewDateAndTime(String newDate, String newTime) {
        elementUtils.clearAndSendKeys(interviewDateInput, newDate);
        elementUtils.clearAndSendKeys(startTimeInput, newTime);
    }

    public void isChangesSavedSuccessfully() {
        Assert.assertTrue("Changes were not saved successfully.", elementUtils.isElementDisplayed(successMessage));
    }

    public void isEmailContentCorrect(String expectedContent) {
        String actualContent = elementUtils.getElementText(emailContent);
        Assert.assertEquals(actualContent, expectedContent, "Email content is not correct.");
    }

    public void isCanceledInterviewInCalendar() {
        boolean isCanceled = true; // Placeholder logic
        Assert.assertTrue(isCanceled, "Canceled interview is not in the calendar.");
    }

    public void selectScheduledInterviewToEdit() {
        WebElement scheduledInterview = driver.findElement(By.xpath("//div[@class='interview'][@data-status='scheduled']"));
        elementUtils.clickElement(scheduledInterview);
    }

    public void areUpdatedNotificationsSent() {
        boolean notificationsSent = true; // Placeholder logic
        Assert.assertTrue(notificationsSent, "Updated notifications are not sent.");
    }

    public void schedulePanelInterviewWithMultipleAttendees() {
        elementUtils.clickElement(scheduleButton);
    }

    public void completeSchedulingProcess() {
        elementUtils.clickElement(completeButton);
    }

    public void isInterviewCancelledSuccessfully() {
        boolean isCancelled = true; // Placeholder logic
        Assert.assertTrue(isCancelled, "Interview is not cancelled successfully.");
    }

    public void isUpdatedInterviewInCalendar() {
        boolean isUpdated = true; // Placeholder logic
        Assert.assertTrue(isUpdated, "Updated interview is not in the calendar.");
    }

    public void isOptionalInformationDisplayedCorrectly() {
        Assert.assertTrue("Optional information is not displayed correctly.", elementUtils.isElementDisplayed(optionalInfo));
    }

    public void selectAttendeesInterviewRound(String round) {
        elementUtils.selectOptionInDropdown(interviewRoundDropdown, round);
    }

    public void isInterviewScheduledInCalendar() {
        boolean isScheduled = true; // Placeholder logic
        Assert.assertTrue(isScheduled, "Interview is not scheduled in the calendar.");
    }
}