package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "jobOpeningOption")
    private WebElement jobOpeningOption;

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;

    @FindBy(id = "qualificationField")
    private WebElement qualificationField;

    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;

    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;

    @FindBy(id = "minimumExperienceField")
    private WebElement minimumExperienceField;

    @FindBy(id = "maximumExperienceField")
    private WebElement maximumExperienceField;

    @FindBy(id = "responsibilitiesField")
    private WebElement responsibilitiesField;

    @FindBy(id = "tagsField")
    private WebElement tagsField;

    @FindBy(id = "departmentField")
    private WebElement departmentField;

    @FindBy(id = "industryTypeField")
    private WebElement industryTypeField;

    @FindBy(id = "primarySkillsField")
    private WebElement primarySkillsField;

    @FindBy(id = "secondarySkillsField")
    private WebElement secondarySkillsField;

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickJobOpeningOption() {
        elementUtils.clickElement(jobOpeningOption);
    }

    public void clickAddJobOpeningButton() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public void clickSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public boolean isJobOpeningScreenDisplayed() {
        return elementUtils.isElementDisplayed(jobOpeningScreen);
    }

    public void enterQualification(String qualification) {
        elementUtils.clearAndSendKeys(qualificationField, qualification);
    }

    public void selectLocation(String location) {
        elementUtils.selectOptionInDropdown(locationDropdown, location);
    }

    public void selectJobRole(String jobRole) {
        elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
    }

    public void enterMinimumExperience(String minimumExperience) {
        elementUtils.clearAndSendKeys(minimumExperienceField, minimumExperience);
    }

    public void enterMaximumExperience(String maximumExperience) {
        elementUtils.clearAndSendKeys(maximumExperienceField, maximumExperience);
    }

    public void enterResponsibilities(String responsibilities) {
        elementUtils.clearAndSendKeys(responsibilitiesField, responsibilities);
    }

    public void enterTags(String tags) {
        elementUtils.clearAndSendKeys(tagsField, tags);
    }

    public void enterDepartment(String department) {
        elementUtils.clearAndSendKeys(departmentField, department);
    }

    public void enterIndustryType(String industryType) {
        elementUtils.clearAndSendKeys(industryTypeField, industryType);
    }

    public void enterPrimarySkills(String primarySkills) {
        elementUtils.clearAndSendKeys(primarySkillsField, primarySkills);
    }

    public void enterSecondarySkills(String secondarySkills) {
        elementUtils.clearAndSendKeys(secondarySkillsField, secondarySkills);
    }

    public boolean isJobOpeningSavedSuccessfully() {
        // Implement the check for successful job opening save
        return true; // Placeholder return statement
    }

    public boolean isJobOpeningAvailableInList() {
        // Implement the check for job opening in the list
        return true; // Placeholder return statement
    }

    public boolean areSaveCancelButtonsDisplayed() {
        // Implement the check for save and cancel buttons
        return true; // Placeholder return statement
    }

    public boolean isAddJobOpeningButtonVisible() {
        return elementUtils.isElementDisplayed(addJobOpeningButton);
    }

    public void isJobOpeningAvailableWithCorrectWorkMode() {
        WebElement workModeElement = driver.findElement(By.xpath("//div[contains(text(),'Work Mode')]"));
        Assert.assertTrue(workModeElement.isDisplayed(), "Work Mode is not available!");
    }

    public void isCreateNewJobOpeningFormOpened() {
        WebElement createNewJobForm = driver.findElement(By.id("createNewJobOpeningForm"));
        Assert.assertTrue(createNewJobForm.isDisplayed(), "Create New Job Opening form is not opened!");
    }

    public void selectVendor(String vendorName) {
        WebElement vendorDropdown = driver.findElement(By.id("vendorDropdown"));
        elementUtils.selectOptionInDropdown(vendorDropdown, vendorName);
    }

    public void enterShortJobDescription(String description) {
        WebElement shortJobDescriptionInput = driver.findElement(By.id("shortJobDescription"));
        elementUtils.clearAndSendKeys(shortJobDescriptionInput, description);
    }

    public void isButtonVisible(String buttonId) {
        WebElement buttonElement = driver.findElement(By.id(buttonId));
        Assert.assertTrue(buttonElement.isDisplayed(), buttonId + " button is not visible!");
    }

    public void isJobOpeningAvailableWithCorrectIndustryType(String expectedIndustryType) {
        WebElement industryTypeElement = driver.findElement(By.xpath("//div[contains(text(),'Industry Type')]"));
        String actualIndustryType = industryTypeElement.getText();
        Assert.assertEquals(actualIndustryType, expectedIndustryType, "Industry Type does not match!");
    }

    public void isJobOpeningAvailableWithCorrectDepartment(String expectedDepartment) {
        WebElement departmentElement = driver.findElement(By.xpath("//div[contains(text(),'Department')]"));
        String actualDepartment = departmentElement.getText();
        Assert.assertEquals(actualDepartment, expectedDepartment, "Department does not match!");
    }

    public void isJobOpeningAvailableWithCorrectVendor(String expectedVendorName) {
        WebElement vendorElement = driver.findElement(By.xpath("//div[contains(text(),'Vendor')]"));
        String actualVendorName = vendorElement.getText();
        Assert.assertEquals(actualVendorName, expectedVendorName, "Vendor does not match!");
    }

    public void isJobOpeningAvailableWithCorrectTags(String expectedTag) {
        WebElement tagElement = driver.findElement(By.xpath("//div[contains(text(),'Tag')]"));
        String actualTag = tagElement.getText();
        Assert.assertEquals(actualTag, expectedTag, "Tag does not match!");
    }

    public void isJobOpeningAvailable() {
        WebElement jobOpeningElement = driver.findElement(By.xpath("//div[contains(text(),'Job Opening')]"));
        Assert.assertTrue(jobOpeningElement.isDisplayed(), "Job Opening is not available!");
    }
}