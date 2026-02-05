
@feature_open_create_new_job_opening
Feature: OpenCreateNewJobOpeningFor

  Background: 
    Given the user is on the Job Opening screen

  @verify_add_job_opening
  Scenario Outline: Open Create New Job Opening Form
    When the user locates the Add Job Opening button
    And the user clicks on the Add Job Opening button
    Then the Create New Job Opening form is displayed
    And the form contains fields for job title, description, requirements, and other relevant information
    And the form displays Save and Cancel buttons

  Examples:
    |  |
    |  |

@verify_mandatory_fields
Scenario Outline: Open Create New Job Opening Form
  When the user clicks on the Add Job Opening button to open the form
  Then the form includes mandatory fields such as Job Title, Job Description, and Job Requirements
  And each mandatory field is clearly marked

Examples:
  | job_title       | job_description | job_requirements |
  | Software Engineer| Develop software | Bachelor's Degree |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user fills in the Job Title with <job_title>
    And the user fills in the Job Description with <job_description>
    And the user fills in the Job Requirements with <job_requirements>
    And the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening has been created

    Examples:
      | job_title                | job_description                                         | job_requirements                                                                                     |
      | Software Engineer        | Develop and maintain software applications.            | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development. |

  @cancel_button_action
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button
    And the user enters <job_title> in the Job Title field
    And the user enters <job_description> in the Job Description field
    And the user clicks on the Cancel button
    Then the Create New Job Opening form should be closed
    And the user should be returned to the Job Opening screen without any data being saved

    Examples:
      | job_title            | job_description                             |
      | Software Engineer    | Develop and maintain software applications. |

  @reset-job-opening-form
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user fills in the Job Title and Job Description fields
    And the user clicks on the Add Job Opening button again
    Then the Create New Job Opening form is displayed again
    And all fields are reset to their default state

  Examples:
    | Job Title       | Job Description         |
    | <job_title>     | <job_description>       |

@screen_reader_accessibility
Scenario Outline: Open Create New Job Opening Form
  When the user clicks on the Add Job Opening button to open the form
  And the user uses a screen reader to navigate through the form fields
  Then all form fields are announced correctly by the screen reader
  And labels for each field are clear and descriptive

Examples:
  | username | password |
  |          |          |

  @keyboard_shortcut_navigation
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user uses the Tab key to navigate through the form fields
    And the user uses the Enter key to select the Save button
    Then the user can navigate through all fields using the Tab key
    And the Save button is activated using the Enter key

  Examples:
    | action                       |
    | Click on the Add Job Opening button to open the form |
    | Use the Tab key to navigate through the form fields   |
    | Use the Enter key to select the Save button          |

@valid-create-job-opening
Scenario Outline: Open Create New Job Opening Form
  When the user clicks on the Add Job Opening button
  And the user fills in valid data with Job Title as <job_title>
  And the user fills in valid data with Job Description as <job_description>
  And the user fills in valid data with Job Requirements as <job_requirements>
  When the user clicks on the Save button
  Then the job opening is saved successfully
  And the user is redirected to the Job Opening screen
  And a success message is displayed confirming the job opening has been created

Examples:
  | job_title              | job_description                                      | job_requirements                                         |
  | Software Engineer      | Develop and maintain software applications.         | Bachelor's degree in Computer Science, 3+ years of experience. |

  @successful-job-opening-creation
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user fills in valid data in all mandatory fields and some optional fields
    And the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening has been created

  Examples:
    |  |
    |  |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user fills in valid data in all mandatory fields and all optional fields
    And the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening has been created

  Examples:
    |  |
    |  |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Add Job Opening button to open the form
    And the user fills in valid data in all mandatory fields and leaves optional fields empty
    And the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening has been created

  Examples:
    |  |
    |  |
