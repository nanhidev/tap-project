package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utils.ElementUtils;
import org.junit.Assert;
import java.time.Duration;
import java.util.List;

public class UploadNewCandidateProfile_poPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "profileSection")
    private WebElement profileSection;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "uploadSuccessMessage")
    private WebElement uploadSuccessMessage;

    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    @FindBy(id = "metadataSection")
    private WebElement metadataSection;

    @FindBy(css = ".profile")
    private List<WebElement> profileList;

    public UploadNewCandidateProfile_poPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfileSection() {
        try {
            elementUtils.clickElement(profileSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUploadIconVisible() {
        try {
            return elementUtils.isElementDisplayed(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(uploadSuccessMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUploadSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(uploadSuccessMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isConfirmationMessageDisplayed(String candidateProfileFile) {
        try {
            String actualMessage = elementUtils.getElementText(confirmationMessage);
            String expectedMessage = "Profile " + candidateProfileFile + " uploaded successfully.";
            Assert.assertEquals(actualMessage, expectedMessage, "Confirmation message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areProfilesListed() {
        try {
            return profileList.size() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectCandidateProfileFile(String validCandidateProfileFile) {
        try {
            WebElement fileInput = driver.findElement(By.id("fileInput"));
            fileInput.sendKeys(validCandidateProfileFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileInFormat(String fileFormat) {
        try {
            WebElement formatDropdown = driver.findElement(By.id("fileFormatDropdown"));
            elementUtils.clickElement(formatDropdown);
            WebElement option = driver.findElement(By.xpath("//option[text()='" + fileFormat + "']"));
            elementUtils.clickElement(option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectMultipleCandidateProfileFiles(String candidateProfileFiles) {
        try {
            WebElement fileInput = driver.findElement(By.id("fileInput"));
            fileInput.sendKeys(candidateProfileFiles);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUploadProcessCompleted() {
        try {
            return isUploadSuccessMessageDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isMetadataDisplayedCorrectly() {
        try {
            return elementUtils.isElementDisplayed(metadataSection);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectCandidateProfileFileInSupportedFormat() {
        try {
            // Logic to select a candidate profile file in a supported format
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileWithMetadata() {
        try {
            // Logic to select a candidate profile file that includes metadata
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidCandidateProfileFile() {
        try {
            // Logic to select an explicitly valid candidate profile file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadCloudIcon() {
        try {
            WebElement cloudUploadIcon = driver.findElement(By.id("cloudUploadIcon"));
            elementUtils.clickElement(cloudUploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFileByName(String fileName) {
        try {
            // Logic to select a file by its name
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileByName(String fileName) {
        try {
            // Logic to select a candidate profile file by its name
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFileWithDifferentValidExtension(String fileExtension) {
        try {
            // Logic to select a candidate profile file with a different valid extension
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectMultipleValidCandidateProfileFiles() {
        try {
            // Logic to select multiple valid candidate profile files
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessConfirmationMessageDisplayed() {
        try {
            WebElement successMessageElement = driver.findElement(By.xpath("//div[contains(text(), 'Success: All profiles listed.')]"));
            String actualMessage = elementUtils.getElementText(successMessageElement);
            String expectedMessage = "Success: All profiles listed.";
            Assert.assertEquals(actualMessage, expectedMessage, "Confirmation message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}