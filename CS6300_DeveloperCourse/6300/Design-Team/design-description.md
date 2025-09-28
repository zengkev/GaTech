### Design Description

***

**1. When the app is started, the user is presented with the main menu, which allows the user to (1) enter or edit current job details, (2) enter job offers, (3) adjust the comparison settings, or (4) compare job offers (disabled if no job offers were entered yet).** 
> The `JobComparisonApp` class acts as the central controller for the application's logic. It is also the entry point of the application and GUI flow. According to the requirements, there will be 4 operations/options for users to choose: (1) enter or edit current job details, (2) enter job offers, (3) adjust the comparison settings, or (4) compare job offers. In response to user actions, the GUI will call the corresponding methods on an instance of `JobComparisonApp` (e.g., `enterOrEditCurrentJob()`, `enterJobOffer()`, `adjustComparisonSettings()`. `compareJobOffers`). For `(4) compare job offers (disabled if no job offers were entered yet)` requirement, our plan is to enable or disable this option on GUI everytime current job or offers are added/updated. Therefore, the GUI will show appropriate state of the comparison feature, and thus `diabled` requirement is not explicitly represented within the diagram.

***

**2. When choosing to enter current job details, a user will:**
* **a. Be shown a user interface to enter (if it is the first time) or edit all the details of their current job, which consists of: Title, Company, Location, Cost of living, Yearly salary, Yearly bonus, Relocation Allowance, Wellness Fund, and Dental Insurance.**
    > The `enterOrEditCurrentJob()` method in `JobComparisonApp` handles user interaction for enter (if it is the first time) or edit all the details of their current job. For `enter` or `edit` requirement, our plan is to update GUI everytime current job are added/updated or opening application. Therefore, the GUI will show appropriate feature option, and thus requirement is not explicitly represented within the diagram.

    > As per the requirement for current job details, the `Job` class is created and has attributes such as `title`, `company`, `location`, `yearlySalary`, `yearlyBonus`, `relocationAllowance`, `wellnessFund`, and `dentalInsurance`. `yearlySalary`, `yearlyBonus`, `relocationAllowance`, `wellnessFund`, and `dentalInsurance`. The values will be entered when `enterOrEditCurrentJob()` method is called.

    > `city`, `state`, and `costOfLivingIndex` are grouped as attributes into the `Location` class to provide clarity for the `Job` class. According to the data on expatistan.com, `costOfLivingIndex` should be represented by an `Int` type. `Job` class "has" location only, so that the relationship is  one-to-one composition. The values will be entered when `enterOrEditCurrentJob()` method is called. 

    > Since the application holds the data of the current job details, `Job` class; the `JobComparisonApp` class will have `currentJob` of type `Job` as a new attribute. The `JobComparisonApp` class represents the user that "manage" current job, and a user has either 0 or 1 job, so the relationship is composition and the multiplicity is `0..1` on `Job` class.

    > Relocation Allowance, Wellness Fund, and Dental Insurance are modeled as separate `Relocation`, `Wellness`, and `Insurance` with attribute `amount`, `stipend`, and `annualCoverage` of type float for money to hold user input value. This is a design choice allow modularity and dynamic management if the system grows complex, and also ensure encapsulation on data and behavior. The values will be entered when `enterOrEditCurrentJob()` or `enterJobOffer()` method are called. One `Job` "has" one `Location`, `Relocation`, `Wellness`, and `Insurance` only, so the relationship is 1-1 composition.

* **b. Be able to either save the job details or cancel and exit without saving, returning in both cases to the main menu.**
    > This is a UI flow. Saving updates the `Job` object's attributes. Canceling doesn't send a post request to add and the UI returns the user to the main screen. This requirement does not add changes to the system design.

***

**3. When choosing to enter job offers, a user will:**
* **a. Be shown a user interface to enter all the details of the offer, which are the same ones listed above for the current job**
    > The GUI will call the `enterJobOffer()` method in `JobComparisonApp`, which creates a new `Job` object with data from user input. This requirement does not add changes to the system design.

* **b. Be able to either save the job offer details or cancel.**
    > Saving adds the new `Job` object to the `jobs` list in `JobComparisonApp`. Canceling doesn't send a post request to add. This requirement does not add changes to the system design.

* **c. Be able to (1) enter another offer, (2) return to the main menu, or (3) compare the offer (if they saved it) with the current job details (if present).**
    > This is a control flow managed by the GUI after an offer is saved. The GUI can call `enterJobOffer()` again, return to the main screen, or proceed to the comparison view by using `compareJobOffers()`. This requirement does not add changes to the system design.

***

**4. When adjusting the comparison settings, the user can assign integer weights to: Yearly salary, Yearly bonus, Relocation Allowance, Wellness Fund, and Dental Insurance. If no weights are assigned, all factors are considered equal. NOTE: These factors should be integer-based from 0 (no interest/don’t care) to 9 (highest interest). Default value for all weights: 1. If no weights are assigned, all factors are considered equal. The user must be able to either save the comparison settings or cancel both options will return the user to the main menu.**
> To realize this requirement, `ComparisonSettings` class is created with the following attributes: `salaryWeight`, `bonusWeight`, `wellnessWeight`, `relocationWeight`, and `dentalInsuranceWeight` type integer and 1 as default value. There will be input validation to check value from 0 to 9 which can be handled when save. `settings` attribute of type `ComparisonSettings` is added to `JobComparisonApp` to store these data entered by the user.  `adjustComparisonSettings()` method is added to the `JobComparisonApp` class to guide the user in entering values for updating the `settings` attribute. One `JobComparisonApp` "uses" a set of comparison settings only, so the relationship is 1-1 composition. 

***

**5. When choosing to compare job offers, a user will:**
* **a. Be shown a list of job offers, displayed as Title and Company, ranked from best to worst, and including the current job (if present), clearly indicated.**
    > The `compareJobOffers()` method calls `getRankJobs()` to get a list of jobs based on their score. This method iterates through each `Job` and calls `calculateScore(settings)` to get a score for sorting. `calculateScore(settings)` will use `ComparisonSettings` object to calculate score for the job. UI will handle indication to current job. The `Job` class has a dependency relationship on the `ComparisonSettings` to `calculateScore`. 

* **b. Select two jobs to compare and trigger the comparison.**
    > This is a UI interaction. After the user selects two `Job` objects, the application will display their details. This requirement does not add changes to the system design.

* **c. Be shown a table comparing the two jobs, displaying, for each job: Title, Company, Location, Yearly salary adjusted for cost of living, Yearly bonus adjusted for cost of living, RA, WS, and DI.**
    > The application retrieves the selected `Job` objects and displays their relevant attributes side-by-side. In `Job` class, `getAdjustedSalary()` method is added to obtain the adjusted yearly salary (AYS), `getAdjustedBonus()` method is added to  obtain the adjusted yearly bonus (AYB), and calls the appropriate methods `getReimbursement(AYS)`, `getAnnualBenefit(AYB)`, and `getAnnualValue()`  in the `Relocation`, `Wellness`, and `Insurance` classes to get the values for RA, WS, and DI. Each benefit class encapsulates its own calculation logic—for instance, `Relocation` bases its value on AYS, while `Wellness` uses AYB. This approach keeps the `Job` class focused and improves maintainability. 


* **d. Be offered to perform another comparison or go back to the main menu.**
    > This is a UI flow. This requirement does not add changes to the system design.

***

**6. When ranking jobs, a job's score is computed as the weighted average of: AYS + AYB + RA + WS + DI.**
> The logic is implemented in the `calculateScore(settings)` method. It calculates each component's value, applies the weights from the `ComparisonSettings` object, and computes the final weighted score. This requirement is not neccessarily reflected on system design.

***

**7. The user interface must be intuitive and responsive.**
> This is a non-functional requirement that relates to the UI and does not add changes to the system design.

***

**8. For simplicity, you may assume there is a single system running the app (no communication or saving between devices is necessary).**
> This is a requirement not related to the UML class diagram.