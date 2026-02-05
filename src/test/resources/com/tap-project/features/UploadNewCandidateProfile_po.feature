
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile_po

Background: 
  Given the user is on the Profile section

@successful-upload
Scenario Outline: Upload New Candidate Profile
  Given the upload icon is visible and clickable
  When the user clicks on the upload icon
  And the user browses and selects a valid candidate profile file
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message appears indicating the profile was uploaded successfully

Examples:
  | valid_candidate_profile_file |
  | valid_profile.pdf            |
  | valid_profile.docx           |

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload (cloud) icon
  And the recruiter browses and selects the <candidate_profile_file>
  And the recruiter clicks on the Upload button
  Then the recruiter should see a confirmation message for the <candidate_profile_file>
  
Examples:
  | candidate_profile_file                     |
  | the first valid candidate profile file     |
  | the second valid candidate profile file    |

Then both profiles should be listed in the Profile section

  @upload-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a candidate profile file in a supported format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should appear, indicating the profile was uploaded successfully

    Examples:
      | file_format |
      | PDF         |
      | DOCX        |

  @long-filename-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with the filename "<filename>"
    And the user clicks on the Upload button
    Then the upload process should complete without errors
    And a success confirmation message should appear, indicating the profile was uploaded successfully

    Examples:
      | filename                                                        |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

  @upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with metadata
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the metadata should be displayed correctly in the Profile section

  Examples:
    | candidate_profile_file |
    | <candidate_profile_file> |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a different valid extension <file_extension>
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message appears, indicating the profile was uploaded successfully

    Examples:
      | file_extension |
      | RTF            |

  @feature_upload_candidate_profile
  @upload-success
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should appear, indicating the profile was uploaded successfully

  Examples:
    | candidate_profile_file |
    | valid_candidate_profile |

  @upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a candidate profile file in <file_format>
    And the user clicks the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message indicating the profile was uploaded successfully

    Examples:
      | file_format |
      | RTF         |

@upload-multiple-profiles
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects multiple valid candidate profile files
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then all uploaded profiles should be listed in the Profile section

Examples:
  | candidate_profile_files       |
  | file1.pdf, file2.pdf, file3.pdf |
