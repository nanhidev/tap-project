
@feature_create_job_opening
Feature: CreateJobOpening

Background: 
  Given the user is on the Dashboard

@navigate_to_job_opening
Scenario Outline: Create Job Opening
  When the user clicks on the "Job Opening" option in the side navigation
  Then the Job Opening screen should be displayed
  And the "Add Job Opening" button should be visible

Examples:
  | job_opening_option |
  | Job Opening        |

  @open_create_job_form
  Scenario Outline: Create Job Opening
    When the recruiter clicks on the "Add Job Opening" button
    Then the Create New Job Opening form should be opened
    And the "Save" and "Cancel" buttons should be displayed

  Examples:
    | action                     |
    | Add Job Opening            |

  @create-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role <job_role>
    And the recruiter selects the Location <location>
    And the recruiter enters Minimum Experience <minimum_experience>
    And the recruiter enters Maximum Experience <maximum_experience>
    And the recruiter enters Qualification <qualification>
    And the recruiter enters Short Job Description <short_job_description>
    And the recruiter enters Responsibilities <responsibilities>
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list

  Examples:
    | job_role          | location   | minimum_experience | maximum_experience | qualification       | short_job_description               | responsibilities                                   |
    | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | This is a short job description.   | 1. Develop software solutions. 2. Collaborate with team members. |

@valid-job-creation
Scenario Outline: Create Job Opening
  When the recruiter selects <job_role> as the Job Role
  And the recruiter selects <location> as the Location
  And the recruiter enters <minimum_experience> as the Minimum Experience
  And the recruiter leaves Maximum Experience blank
  And the recruiter enters <qualification> as the Qualification
  And the recruiter leaves Responsibilities blank
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list

Examples:
  | job_role          | location   | minimum_experience | qualification        |
  | Software Engineer  | New York   | 3                  | Bachelor's Degree     |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters Tags
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct tags

  Examples:
    | job_role          | location   | min_experience | max_experience | qualification       | tags                |
    | Software Engineer  | New York   | 2              | 5              | Bachelor's Degree    | Java, Python, SQL   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the admin selects the Job Role <job_role>
  And the admin selects the Location <location>
  And the admin enters the Minimum Experience <minimum_experience>
  And the admin enters the Maximum Experience <maximum_experience>
  And the admin enters the Qualification <qualification>
  And the admin selects the Vendor <vendor>
  And the admin clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct vendor

Examples:
  | job_role         | location   | minimum_experience | maximum_experience | qualification       | vendor     |
  | Software Engineer | New York   | 2                  | 5                  | Bachelor's Degree    | Vendor A   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When I select a Job Role
  And I select a Location
  And I enter Minimum Experience
  And I enter Maximum Experience
  And I enter Qualification
  And I select a valid Work Mode
  And I click on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct work mode

  Examples:
    | Job Role          | Location   | Minimum Experience | Maximum Experience | Qualification       | Work Mode |
    | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree    | Remote    |

  @valid-job-opening
  Scenario Outline: Create Job Opening
    When the recruiter selects the Job Role
    And the recruiter selects the Location
    And the recruiter enters the Minimum Experience
    And the recruiter enters the Maximum Experience
    And the recruiter enters the Qualification
    And the recruiter enters a valid Department
    And the recruiter clicks on "Save"
    Then the job opening should be saved successfully
    And the job opening should be available in the Job Opening list with the correct department

    Examples:
      | Job Role          | Location   | Minimum Experience | Maximum Experience | Qualification        | Department   |
      | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree     | Engineering   |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters a valid Industry Type
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct industry type

  Examples:
    | Job Role          | Location   | Minimum Experience | Maximum Experience | Qualification       | Industry Type          |
    | Software Engineer  | New York   | 2                  | 5                  | Bachelor's Degree     | Information Technology  |

@valid-job-opening
Scenario Outline: Create Job Opening
  When the recruiter selects a Job Role
  And the recruiter selects a Location
  And the recruiter enters Minimum Experience
  And the recruiter enters Maximum Experience
  And the recruiter enters Qualification
  And the recruiter enters valid Primary Skills
  And the recruiter enters valid Secondary Skills
  And the recruiter clicks on "Save"
  Then the job opening should be saved successfully
  And the job opening should be available in the Job Opening list with the correct skills

Examples:
  | Job Role       | Location       | Minimum Experience | Maximum Experience | Qualification | Primary Skills | Secondary Skills |
  | Software Engineer | New York     | 2 years           | 5 years           | Bachelor's     | Java           | Python           |
